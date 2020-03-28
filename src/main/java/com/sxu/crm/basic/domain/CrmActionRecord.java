package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmActionRecord
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmActionRecord implements Serializable {
    private Integer id;

    /**
     * 操作人ID
     */
    private Integer createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 类型
     */
    private String types;

    /**
     * 被操作对象ID
     */
    private Integer actionId;

    /**
     * 内容
     */
    private String content;

    private static final long serialVersionUID = 1L;
}