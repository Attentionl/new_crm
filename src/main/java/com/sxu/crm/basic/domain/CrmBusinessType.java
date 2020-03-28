package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmBusinessType
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmBusinessType implements Serializable {
    private Integer typeId;

    /**
     * 标识
     */
    private String name;

    /**
     * 部门ID
     */
    private String deptIds;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 1启用0禁用
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}