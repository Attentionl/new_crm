package com.sxu.crm.erp.admin.controller;

import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.servlet.ServletUtil;
import com.sxu.crm.basic.common.BaseConstant;
import com.sxu.crm.basic.config.redis.GetRedisTemplate;
import com.sxu.crm.basic.domain.AdminUser;
import com.sxu.crm.basic.utils.BaseUtil;
import com.sxu.crm.basic.utils.Result;
import com.sxu.crm.erp.admin.service.AdminLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

/**
 * 用户登录
 *
 * @author z
 */
@RequestMapping("/")
public class AdminLoginController {

    private static final Logger log = LoggerFactory.getLogger(AdminLoginController.class);

    @Autowired
    private AdminLoginService adminLoginService;

    /**
     * @param username 用户名
     * @param password 密码
     * @author
     * 用户登录
     */
    @PostMapping("login")
    public Result login(@Param("username") String username, @Param("password") String password, HttpServletRequest request) {
        System.out.println(username+password);
        String key = BaseConstant.USER_LOGIN_ERROR_KEY + username;
        long beforeTime = System.currentTimeMillis() - 60 * 5 * 1000;
        if (GetRedisTemplate.redisTemplate.hasKey(key)) {
            if (GetRedisTemplate.redisTemplate.opsForZSet().count(key, beforeTime, System.currentTimeMillis()) >= 5) {
                Set set = GetRedisTemplate.redisTemplate.opsForZSet().reverseRange(key, 4, 5);
                Long time = (Long) set.iterator().next() + 60 * 5 * 1000;
                long expire = (time - System.currentTimeMillis()) / 1000;
                return (Result.error("密码错误次数过多，请等" + expire + "秒后在重试！"));
            }
        }
        GetRedisTemplate.redisTemplate.opsForZSet().add(key, System.currentTimeMillis(), System.currentTimeMillis());
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return Result.error("请输入用户名和密码！");
        }
        AdminUser user = adminLoginService.queryByUserName(username.trim());
        if (user == null) {
            return Result.error("用户名或密码错误！");
        }
        if (user.getStatus() == 0) {
            return Result.error("账户被禁用！");
        }
        if (BaseUtil.verify(username + password, user.getSalt(), user.getPassword())) {
            if (user.getStatus() == 2) {
                user.setStatus(1);
            }
            GetRedisTemplate.redisTemplate.delete(key);
            String token = UUID.randomUUID().toString().replace("-", "");
            user.setLastLoginIp(ServletUtil.getClientIP(request));
            user.setLastLoginTime(new Date());
            adminLoginService.updateAdminByLoginInfo(user);
            user.setRoles(adminLoginService.queryRoleIdsByUserId(user.getUserId()));
            GetRedisTemplate.getRedis().setIfAbsent(token, user, Duration.ofSeconds(3600));
            Integer type = Integer.parseInt(request.getParameter("type"));
            if (type.equals(null) || type.equals("")) {
                type = 1;
            }
            BaseUtil.setToken(user.getUserId(), token, type);
            //user.remove("password", "salt");
            return Result.ok().put("Admin-Token", token).put("user", user).put("auth", adminLoginService.auth(user.getUserId()));
        } else {
            log.warn("用户登录失败");
            return Result.error("用户名或密码错误！");
        }

    }

    /**
     * @author
     * 退出登录
     */
    public Result logout(HttpServletRequest request) {
        String token = BaseUtil.getToken(request);
        if (!StrUtil.isEmpty(token)) {
            GetRedisTemplate.redisTemplate.delete(token);
            //removeCookie("Admin-Token");
        }
        return Result.ok();
    }

    public Result version() {
        return Result.ok().put("name", BaseConstant.NAME).put("version", BaseConstant.VERSION);
    }

}
