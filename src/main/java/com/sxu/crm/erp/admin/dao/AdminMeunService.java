package com.sxu.crm.erp.admin.dao;

import org.apache.ibatis.annotations.Select;

/**
 * @author 李今朝
 * @className AdminMeunService
 * @version1.0
 * @description
 * @createdTime 2020/3/27 22:54
 */
public interface AdminMeunService {

    @Select("SELECT  c.realm,c.menu_id,c.parent_id FROM 72crm_admin_user_role as a\n" +
            "      right JOIN 72crm_admin_role_menu as b on a.role_id=b.role_id\n" +
            "      right JOIN 72crm_admin_menu as c on b.menu_id=c.menu_id\n" +
            "      WHERE a.user_id=?")
    void queryMenuByUserId(Long id);
}
