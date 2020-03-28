package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className OaExamineStep
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class OaExamineStep implements Serializable {
    private Integer stepId;

    /**
     * 步骤类型1、负责人主管，2、指定用户（任意一人），3、指定用户（多人会签）,4、上一级审批人主管
     */
    private Integer stepType;

    /**
     * 审批ID
     */
    private Integer categoryId;

    /**
     * 审批人ID (使用逗号隔开) ,1,2,
     */
    private String checkUserId;

    /**
     * 排序
     */
    private Integer stepNum;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}