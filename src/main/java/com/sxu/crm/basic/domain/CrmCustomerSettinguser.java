package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmCustomerSettinguser
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmCustomerSettinguser implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 客户规则限制ID
     */
    private Integer settingId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 部门ID
     */
    private Integer deptId;

    /**
     * 1 员工 2 部门
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}