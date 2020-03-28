package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className OaLog
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class OaLog implements Serializable {
    private Integer logId;

    /**
     * 日志类型（1日报，2周报，3月报）
     */
    private Integer categoryId;

    /**
     * 日志标题
     */
    private String title;

    /**
     * 日志内容
     */
    private String content;

    /**
     * 明日工作内容
     */
    private String tomorrow;

    /**
     * 遇到问题
     */
    private String question;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 通知人
     */
    private String sendUserIds;

    /**
     * 通知部门
     */
    private String sendDeptIds;

    /**
     * 已读人
     */
    private String readUserIds;

    /**
     * 文件批次ID
     */
    private String batchId;

    private static final long serialVersionUID = 1L;
}