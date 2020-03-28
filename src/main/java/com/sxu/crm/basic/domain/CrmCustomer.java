package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmCustomer
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmCustomer implements Serializable {
    private Integer customerId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 跟进状态 0未跟进1已跟进
     */
    private Integer followup;

    /**
     * 1锁定
     */
    private Integer isLock;

    /**
     * 下次联系时间
     */
    private Date nextTime;

    /**
     * 成交状态 0未成交 1已成交
     */
    private Integer dealStatus;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 网址
     */
    private String website;

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
    private Integer ownerUserId;

    /**
     * 只读权限
     */
    private String roUserId;

    /**
     * 读写权限
     */
    private String rwUserId;

    /**
     * 省市区
     */
    private String address;

    /**
     * 定位信息
     */
    private String location;

    /**
     * 详细地址
     */
    private String detailAddress;

    /**
     * 地理位置经度
     */
    private String lng;

    /**
     * 地理位置维度
     */
    private String lat;

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