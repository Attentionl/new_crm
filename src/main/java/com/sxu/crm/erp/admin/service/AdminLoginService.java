package com.sxu.crm.erp.admin.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.db.Db;
import com.alibaba.fastjson.JSONObject;
import com.sxu.crm.basic.common.BaseConstant;
import com.sxu.crm.basic.domain.*;
import com.sxu.crm.basic.mapper.AdminUserMapper;
import com.sxu.crm.basic.mapper.AdminUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.caffeine.CaffeineCache;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李今朝
 * @className AdminLoginService
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:47
 */
public class AdminLoginService {

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Autowired
    private AdminUserRoleMapper adminUserRoleMapper;

    @Autowired
    private AdminMeunService adminMeunService;
    /**
     * 通过名字查询Admin
     *
     * @param name
     * @return
     */
    public AdminUser queryByUserName(String name) {
        AdminUserExample example = new AdminUserExample();
        example.createCriteria().andUsernameEqualTo(name);
        List<AdminUser> adminUsers = adminUserMapper.selectByExample(example);
        return adminUsers.get(0);
    }

    /**
     * 根据登陆信息更新admin的信息
     *
     * @param user
     * @return
     */
    public int updateAdminByLoginInfo(AdminUser user) {
        return adminUserMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 在admin角色表中查询角色
     * SELECT role_id FROM admin_user_role as a WHERE a.user_id=?
     *
     * @param userId
     * @return
     */
    public List<Integer> queryRoleIdsByUserId(Long userId) {
        AdminUserRoleExample example = new AdminUserRoleExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<AdminUserRole> adminUserRoles = adminUserRoleMapper.selectByExample(example);
        List<Integer> result = new ArrayList<>();
        for (AdminUserRole a : adminUserRoles) {
            result.add(a.getRoleId());
        }
        return result;
    }


    public Object auth(Long userId){
        JSONObject jsonObject = new JSONObject();
        List<AdminMenu> menuRecords;
        List<Integer> roleIds = this.queryRoleIdsByUserId(userId);
        if (roleIds.contains(BaseConstant.SUPER_ADMIN_ROLE_ID)) {
            List<AdminMenu> adminMenus = adminMeunService.queryAllMenu();
        } else{
            menuRecords = adminMenuService.queryMenuByUserId(userId);
            //如果是项目管理员查询创建项目角色
            if(roleIds.contains(BaseConstant.WORK_ADMIN_ROLE_ID)){
                menuRecords.add(Db.findFirst("select realm,menu_id,parent_id from `72crm_admin_menu` where remarks = 'projectSave'"));
            }
        }
        List<AdminMenu> adminMenus = adminMenuService.queryMenuByParentId(0);
        for (AdminMenu adminMenu : adminMenus) {
            JSONObject object = new JSONObject();
            List<AdminMenu> adminMenuList = adminMenuService.queryMenuByParentId(adminMenu.getMenuId());
            for (AdminMenu menu : adminMenuList) {
                JSONObject authObject = new JSONObject();
                for (Record record : menuRecords) {
                    if (menu.getMenuId().equals(record.getInt("parent_id"))) {
                        authObject.put(record.getStr("realm"), true);
                    }
                }
                if (!authObject.isEmpty()) {
                    object.put(menu.getRealm(), authObject);
                }
            }
            if (adminMenu.getMenuId().equals(3)) {
                if (roleIds.contains(BaseConstant.SUPER_ADMIN_ROLE_ID)){
                    object.put("system",new JSONObject().fluentPut("read",true).fluentPut("update",true));
                    object.put("configSet",new JSONObject().fluentPut("read",true).fluentPut("update",true));
                    object.put("users",new JSONObject().fluentPut("read",true).fluentPut("userSave",true).fluentPut("userEnables",true).fluentPut("userUpdate",true).fluentPut("deptSave",true).fluentPut("deptUpdate",true).fluentPut("deptDelete",true));
                    object.put("permission",new JSONObject().fluentPut("update",true));
                    object.put("oa",new JSONObject().fluentPut("examine",true));
                    object.put("examineFlow",new JSONObject().fluentPut("update",true));
                    object.put("crm",new JSONObject().fluentPut("field",true).fluentPut("pool",true).fluentPut("setting",true).fluentPut("achievement",true));
                    object.put("work",new JSONObject().fluentPut("update",true));
                }
            }
            if (!object.isEmpty()) {
                jsonObject.put(adminMenu.getRealm(), object);
            }
        }
        List<String> moduleName = Db.query("select name from 72crm_admin_config where name in ('oa','crm','project') and status = 0");
        if(!jsonObject.containsKey("project")){
            jsonObject.put("project",new Object());
        }
        if(!jsonObject.containsKey("oa")){
            jsonObject.put("oa",new Object());
        }
        for (String s : moduleName) {
            jsonObject.remove(s);
            JSONObject bi = jsonObject.getJSONObject("bi");
            if (bi != null) {
                if (s.equals("oa")) {
                    bi.remove("oa");
                } else if (s.equals("crm")) {
                    String[] oabiMenuArr = new String[]{"achievement","business","customer","contract","product","portrait","ranking"};
                    List<String> oabiMenuList = CollectionUtil.newArrayList(oabiMenuArr);
                    oabiMenuList.forEach(bi::remove);
                }
            }
        }
        CaffeineCache.ME.put("role:permissions:",userId.toString(),jsonObject);
        return jsonObject;
    }

}
