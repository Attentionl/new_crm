package com.sxu.crm.erp.admin.service;

import com.sxu.crm.basic.domain.AdminMenu;
import com.sxu.crm.basic.domain.AdminMenuExample;
import com.sxu.crm.basic.mapper.AdminMenuMapper;

import java.util.List;

/**
 * @author 李今朝
 * @className AdminMeunService
 * @version1.0
 * @description
 * @createdTime 2020/3/27 22:42
 */
public class AdminMeunService {

    private AdminMenuMapper adminMenuMapper;

    public List<AdminMenu> queryAllMenu(){

        AdminMenuExample example = new AdminMenuExample();
        example.createCriteria().andMenuIdIsNotNull();
        List<AdminMenu> adminMenus = adminMenuMapper.selectByExample(example);

        return adminMenus;
    }



}
