package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className WorkTaskLog
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class WorkTaskLog implements Serializable {
    /**
     * 项目日志表
     */
    private Integer logId;

    /**
     * 操作人ID
     */
    private Integer userId;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 状态 4删除
     */
    private Integer status;

    /**
     * 任务ID
     */
    private Integer taskId;

    /**
     * 项目ID
     */
    private Integer workId;

    private static final long serialVersionUID = 1L;
}