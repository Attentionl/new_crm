package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmLeads
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmLeads implements Serializable {
    private Integer leadsId;

    /**
     * 1已转化 0 未转化
     */
    private Integer isTransform;

    /**
     * 跟进状态 0未跟进1已跟进
     */
    private Integer followup;

    /**
     * 线索名称
     */
    private String leadsName;

    /**
     * 客户id
     */
    private Integer customerId;

    /**
     * 下次联系时间
     */
    private Date nextTime;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 地址
     */
    private String address;

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

    private String lastContent;

    private static final long serialVersionUID = 1L;
}