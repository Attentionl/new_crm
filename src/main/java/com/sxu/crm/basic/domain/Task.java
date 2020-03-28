package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className Task
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class Task implements Serializable {
    /**
     * 任务表
     */
    private Integer taskId;

    /**
     * 任务名称
     */
    private String name;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 负责人ID
     */
    private Long mainUserId;

    /**
     * 团队成员ID
     */
    private String ownerUserId;

    /**
     * 新建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 完成状态 1正在进行2延期3归档 5结束
     */
    private Integer status;

    /**
     * 分类id
     */
    private Integer classId;

    /**
     * 标签 ,号拼接
     */
    private String labelId;

    /**
     * 描述
     */
    private String description;

    /**
     * 上级ID
     */
    private Integer pid;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date stopTime;

    /**
     * 优先级 从大到小 3高 2中 1低
     */
    private Integer priority;

    /**
     * 项目ID
     */
    private Integer workId;

    /**
     * 工作台展示 0收件箱 1今天要做，2下一步要做，3以后要做
     */
    private Integer isTop;

    /**
     * 是否公开
     */
    private Integer isOpen;

    /**
     * 排序ID
     */
    private Integer orderNum;

    /**
     * 我的任务排序ID
     */
    private Integer topOrderNum;

    /**
     * 归档时间
     */
    private Date archiveTime;

    /**
     * 是否删除 0 未删除 1 删除
     */
    private Integer ishidden;

    /**
     * 删除时间
     */
    private Date hiddenTime;

    /**
     * 批次
     */
    private String batchId;

    /**
     * 1归档
     */
    private Integer isArchive;

    private static final long serialVersionUID = 1L;
}