package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminMessage
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminMessage implements Serializable {
    /**
     * 消息ID
     */
    private Long messageId;

    /**
     * 消息标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 消息大类 1 任务 2 日志 3 oa审批 4公告 5 日程 6 crm消息
     */
    private Integer label;

    /**
     * 消息类型 详见AdminMessageEnum
     */
    private Integer type;

    /**
     * 关联ID
     */
    private Integer typeId;

    /**
     * 消息创建者 0为系统
     */
    private Long createUser;

    /**
     * 接收人
     */
    private Long recipientUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否已读 0 未读 1 已读
     */
    private Integer isRead;

    /**
     * 已读时间
     */
    private Date readTime;

    private static final long serialVersionUID = 1L;
}