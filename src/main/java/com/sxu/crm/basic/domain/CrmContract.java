package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmContract
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmContract implements Serializable {
    private Integer contractId;

    /**
     * 合同名称
     */
    private String name;

    /**
     * 客户ID
     */
    private Integer customerId;

    /**
     * 商机ID
     */
    private Integer businessId;

    /**
     * 0 未审核 1 审核通过 2 审核拒绝 3 审核中 4 已撤回 5草稿 6 作废
     */
    private Integer checkStatus;

    /**
     * 审核记录ID
     */
    private Integer examineRecordId;

    /**
     * 下单日期
     */
    private Date orderDate;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 负责人ID
     */
    private Integer ownerUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 合同编号
     */
    private String num;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 合同金额
     */
    private BigDecimal money;

    /**
     * 整单折扣
     */
    private BigDecimal discountRate;

    /**
     * 产品总金额
     */
    private BigDecimal totalPrice;

    /**
     * 合同类型
     */
    private String types;

    /**
     * 付款方式
     */
    private String paymentType;

    /**
     * 批次 比如附件批次
     */
    private String batchId;

    /**
     * 只读权限
     */
    private String roUserId;

    /**
     * 读写权限
     */
    private String rwUserId;

    /**
     * 客户签约人（联系人id）
     */
    private Integer contactsId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 公司签约人
     */
    private Integer companyUserId;

    private static final long serialVersionUID = 1L;
}