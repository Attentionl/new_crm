package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminRecord
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminRecord implements Serializable {
    private Integer recordId;

    /**
     * 关联类型
     */
    private String types;

    /**
     * 类型ID
     */
    private Integer typesId;

    /**
     * 跟进内容
     */
    private String content;

    /**
     * 跟进类型
     */
    private String category;

    /**
     * 下次联系时间
     */
    private Date nextTime;

    /**
     * 商机ID
     */
    private String businessIds;

    /**
     * 联系人ID
     */
    private String contactsIds;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 批次 比如附件批次
     */
    private String batchId;

    private static final long serialVersionUID = 1L;
}