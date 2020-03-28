package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminExamine
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminExamine implements Serializable {
    private Integer examineId;

    /**
     * 1 合同 2 回款
     */
    private Integer categoryType;

    /**
     * 审核类型 1 固定审批 2 授权审批
     */
    private Integer examineType;

    /**
     * 审批流名称
     */
    private String name;

    /**
     * 部门ID（0为全部）
     */
    private String deptIds;

    /**
     * 员工ID
     */
    private String userIds;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Long createUserId;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private Long updateUserId;

    /**
     * 状态 1 启用 0 禁用 2 删除
     */
    private Integer status;

    /**
     * 流程说明
     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}