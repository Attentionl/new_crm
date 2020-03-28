package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className WorkTaskClass
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class WorkTaskClass implements Serializable {
    /**
     * 任务分类表
     */
    private Integer classId;

    /**
     * 分类名
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 状态1正常
     */
    private Integer status;

    /**
     * 项目ID
     */
    private Integer workId;

    /**
     * 排序
     */
    private Integer orderNum;

    private static final long serialVersionUID = 1L;
}