package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmReceivables
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmReceivables implements Serializable {
    /**
     * 回款ID
     */
    private Integer receivablesId;

    /**
     * 回款编号
     */
    private String number;

    /**
     * 回款计划ID
     */
    private Integer planId;

    /**
     * 客户ID
     */
    private Integer customerId;

    /**
     * 合同ID
     */
    private Integer contractId;

    /**
     * 0 未审核 1 审核通过 2 审核拒绝 3 审核中 4 已撤回
     */
    private Integer checkStatus;

    /**
     * 审核记录ID
     */
    private Integer examineRecordId;

    /**
     * 回款日期
     */
    private Date returnTime;

    /**
     * 回款方式
     */
    private String returnType;

    /**
     * 回款金额
     */
    private BigDecimal money;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 负责人ID
     */
    private Long ownerUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 批次
     */
    private String batchId;

    private static final long serialVersionUID = 1L;
}