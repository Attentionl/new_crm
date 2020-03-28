package com.sxu.crm.basic.utils;

import com.sxu.crm.basic.domain.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author 李今朝
 * @className BaseUtil
 * @version1.0
 * @description 做了修改
 * @createdTime 2020/3/22 21:40
 */

public class BaseUtil {

    @Autowired
    private static RedisTemplate redisTemplate;

    private static ThreadLocal<AdminUser> threadLocal = new ThreadLocal<>();

    private static final String USER_ADMIN_TOKEN = "CRM_USER_ADMIN_TOKEN";

    private static final String USER_MOBILE_TOKEN = "CRM_USER_MOBILE_TOKEN";

    @Value("${devMode}")
    private static boolean isDevMode;

    public static ValueOperations getRedis() {
        return redisTemplate.opsForValue();
    }

    /**
     * 获取当前系统是开发开始正式
     *
     * @return true代表为真
     */
    public static boolean isDevelop() {
        return isDevMode;
    }

    /**
     * 获取当前是否是windows系统
     *
     * @return true代表为真
     */
    public static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("windows");
    }

    /**
     * 签名数据
     *
     * @param key  key
     * @param salt 盐
     * @return 加密后的字符串
     */
    public static String sign(String key, String salt) {
        return DigestUtils.md5DigestAsHex((key + "erp" + salt).getBytes());
    }

    /**
     * 验证签名是否正确
     *
     * @param key  key
     * @param salt 盐
     * @param sign 签名
     * @return 是否正确 true为正确
     */
    public static boolean verify(String key, String salt, String sign) {
        return sign.equals(sign(key, salt));
    }

    /**
     * 获取当前年月的字符串
     *
     * @return yyyyMMdd
     */
    public static String getDate() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
    }

    /**
     * FIXME 如果获取的地址不正确,直接返回一个固定地址也可以
     */
    public static String getIpAddress(HttpServletRequest request) {
        StringBuilder str = new StringBuilder();
        str.append(request.getScheme()).append("://").append(request.getServerName());
        if (!Arrays.asList(80, 443).contains(request.getServerPort())) {
            str.append(":").append(request.getServerPort());
        }
        str.append(request.getContextPath());
        str.append("/");
        return str.toString();
    }

    public static AdminUser getUser() {
        return threadLocal.get();
    }

    public static void setUser(AdminUser adminUser) {
        threadLocal.set(adminUser);
    }

    public static Long getUserId() {
        return getUser().getUserId();
    }

    public static void removeThreadLocal() {
        threadLocal.remove();
    }

    public static String getToken(HttpServletRequest request) {
        return request.getHeader("Admin-Token") != null ? request.getHeader("Admin-Token") : "";
    }

    public static void userExit(Long userId, Integer type) {
        if (type == null || type == 1) {
            if (redisTemplate.hasKey(USER_ADMIN_TOKEN + userId)) {
                String token = (String) getRedis().get(USER_ADMIN_TOKEN + userId);
                redisTemplate.delete(USER_ADMIN_TOKEN + userId);
                redisTemplate.delete(token);
            }
        }
        if (type == null || type == 2) {
            if (redisTemplate.hasKey(USER_MOBILE_TOKEN + userId)) {
                String token = (String) getRedis().get(USER_MOBILE_TOKEN + userId);
                redisTemplate.delete(USER_MOBILE_TOKEN + userId);
                redisTemplate.delete(token);
            }
        }
    }

    public static void setToken(Long userId, String token, Integer type) {
        userExit(userId, type);
        if (redisTemplate.hasKey(token)) {
            if (type == 1) {
                getRedis().setIfAbsent(USER_ADMIN_TOKEN + userId, token, Duration.ofSeconds(redisTemplate.getExpire(token)));
            } else if (type == 2) {
                getRedis().setIfAbsent(USER_MOBILE_TOKEN + userId, token, Duration.ofSeconds(redisTemplate.getExpire(token)));
            }
        }

    }

    public static void userExpire(String token) {
        if (redisTemplate.hasKey(token)) {
            redisTemplate.expire(token, 3600, TimeUnit.SECONDS);
            redisTemplate.expire(USER_ADMIN_TOKEN + getUserId(), 3600, TimeUnit.SECONDS);
            redisTemplate.expire(USER_MOBILE_TOKEN + getUserId(), 3600, TimeUnit.SECONDS);
        }
    }

}
