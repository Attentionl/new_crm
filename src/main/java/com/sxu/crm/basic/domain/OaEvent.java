package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className OaEvent
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class OaEvent implements Serializable {
    private Integer eventId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

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
     * 0不提醒1每天2每周3每月4每年
     */
    private Integer type;

    /**
     * 参与人
     */
    private String ownerUserIds;

    /**
     * 地点
     */
    private String address;

    /**
     * 备注
     */
    private String remark;

    /**
     * 颜色
     */
    private String color;

    /**
     * 提醒时间0准时提醒 1：5分钟前 2：15分钟前 3：30分钟前 4：一个小时前 5：两个小时前 6：一天前 7：两天前 8：一周前
     */
    private Integer remindType;

    private static final long serialVersionUID = 1L;
}