package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminDept
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminDept implements Serializable {
    private Integer deptId;

    /**
     * 父级ID 顶级部门为0
     */
    private Integer pid;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 排序 越大越靠后
     */
    private Integer num;

    /**
     * 部门备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}