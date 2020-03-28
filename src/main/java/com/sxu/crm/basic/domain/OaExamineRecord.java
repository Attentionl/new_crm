package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className OaExamineRecord
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class OaExamineRecord implements Serializable {
    /**
     * 审核记录ID
     */
    private Integer recordId;

    /**
     * 审批ID
     */
    private Integer examineId;

    /**
     * 当前进行的审批步骤ID
     */
    private Long examineStepId;

    /**
     * 审核状态 0 未审核 1 审核通过 2 审核拒绝 3 审核中 4 已撤回
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
     * 审核备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}