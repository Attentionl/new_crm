package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className OaEventNotice
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class OaEventNotice implements Serializable {
    private Integer id;

    /**
     * 日程ID
     */
    private Integer eventId;

    /**
     * 1天 2周 3月 4年 0不提醒
     */
    private String noticetype;

    private String repeat;

    /**
     * 开始时间
     */
    private Integer startTime;

    /**
     * 介绍时间
     */
    private Integer stopTime;

    private static final long serialVersionUID = 1L;
}