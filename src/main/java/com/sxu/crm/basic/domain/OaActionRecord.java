package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className OaActionRecord
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class OaActionRecord implements Serializable {
    private Integer logId;

    /**
     * 操作人ID
     */
    private Long userId;

    /**
     * 操作类型
     */
    private Integer type;

    /**
     * 操作对象id
     */
    private Integer actionId;

    /**
     * 操作时间
     */
    private Date createTime;

    /**
     * 抄送人IDs
     */
    private String joinUserIds;

    /**
     * 抄送部门IDs
     */
    private String deptIds;

    /**
     * 操作内容
     */
    private String content;

    private static final long serialVersionUID = 1L;
}