package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmReceivablesPlan
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmReceivablesPlan implements Serializable {
    private Integer planId;

    /**
     * 期数
     */
    private String num;

    /**
     * 回款ID
     */
    private Integer receivablesId;

    /**
     * 1完成 0 未完成
     */
    private Integer status;

    /**
     * 计划回款金额
     */
    private BigDecimal money;

    /**
     * 计划回款日期
     */
    private Date returnDate;

    /**
     * 计划回款方式
     */
    private String returnType;

    /**
     * 提前几天提醒
     */
    private Integer remind;

    /**
     * 提醒日期
     */
    private Date remindDate;

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
     * 附件批次ID
     */
    private String fileBatch;

    /**
     * 合同ID
     */
    private Integer contractId;

    /**
     * 客户ID
     */
    private Integer customerId;

    private static final long serialVersionUID = 1L;
}