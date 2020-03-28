package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className WorkUser
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class WorkUser implements Serializable {
    private Integer id;

    /**
     * 项目ID
     */
    private Integer workId;

    /**
     * 成员ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Integer roleId;

    private static final long serialVersionUID = 1L;
}