package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className OaAnnouncement
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class OaAnnouncement implements Serializable {
    private Integer announcementId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

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
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 通知部门
     */
    private String deptIds;

    /**
     * 通知人
     */
    private String ownerUserIds;

    /**
     * 已读用户
     */
    private String readUserIds;

    private static final long serialVersionUID = 1L;
}