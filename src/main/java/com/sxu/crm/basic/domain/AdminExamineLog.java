package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminExamineLog
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminExamineLog implements Serializable {
    /**
     * ID
     */
    private Long logId;

    /**
     * 审批记录ID
     */
    private Integer recordId;

    /**
     * 审核步骤ID
     */
    private Long examineStepId;

    /**
     * 审核状态 0 未审核 1 审核通过 2 审核拒绝3 撤回审核
     */
    private Integer examineStatus;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 审核人
     */
    private Long examineUser;

    /**
     * 审核时间
     */
    private Date examineTime;

    /**
     * 审核备注
     */
    private String remarks;

    /**
     * 是否是撤回之前的日志 0或者null为新数据 1：撤回之前的数据
     */
    private Integer isRecheck;

    private Integer orderId;

    private static final long serialVersionUID = 1L;
}