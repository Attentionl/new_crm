package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmBusiness
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmBusiness implements Serializable {
    private Integer businessId;

    /**
     * 商机状态组
     */
    private Integer typeId;

    /**
     * 销售阶段
     */
    private Integer statusId;

    /**
     * 下次联系时间
     */
    private Date nextTime;

    /**
     * 客户ID
     */
    private Integer customerId;

    /**
     * 预计成交日期
     */
    private Date dealDate;

    /**
     * 商机名称
     */
    private String businessName;

    /**
     * 商机金额
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
     * 1赢单2输单3无效
     */
    private Integer isEnd;

    private String statusRemark;

    private static final long serialVersionUID = 1L;
}