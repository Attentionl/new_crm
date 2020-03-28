package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className OaEventRelation
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class OaEventRelation implements Serializable {
    /**
     * 日程关联业务表
     */
    private Integer eventrelationId;

    /**
     * 日程ID
     */
    private Integer eventId;

    /**
     * 客户IDs
     */
    private String customerIds;

    /**
     * 联系人IDs
     */
    private String contactsIds;

    /**
     * 商机IDs
     */
    private String businessIds;

    /**
     * 合同IDs
     */
    private String contractIds;

    /**
     * 状态1可用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}