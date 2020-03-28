package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className OaExamineCategory
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class OaExamineCategory implements Serializable {
    private Integer categoryId;

    /**
     * 名称
     */
    private String title;

    /**
     * 描述
     */
    private String remarks;

    /**
     * 1 普通审批 2 请假审批 3 出差审批 4 加班审批 5 差旅报销 6 借款申请 0 自定义审批
     */
    private Integer type;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 1启用，0禁用
     */
    private Integer status;

    /**
     * 1为系统类型，不能删除
     */
    private Integer isSys;

    /**
     * 1固定2自选
     */
    private Integer examineType;

    /**
     * 可见范围（员工）
     */
    private String userIds;

    /**
     * 可见范围（部门）
     */
    private String deptIds;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 1已删除
     */
    private Integer isDeleted;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 删除人ID
     */
    private Long deleteUserId;

    private static final long serialVersionUID = 1L;
}