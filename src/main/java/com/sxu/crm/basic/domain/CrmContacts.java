package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmContacts
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmContacts implements Serializable {
    private Integer contactsId;

    /**
     * 联系人名称
     */
    private String name;

    /**
     * 下次联系时间
     */
    private Date nextTime;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 职务
     */
    private String post;

    /**
     * 客户ID
     */
    private Integer customerId;

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
     * 批次
     */
    private String batchId;

    private static final long serialVersionUID = 1L;
}