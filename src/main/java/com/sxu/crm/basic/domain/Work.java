package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className Work
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class Work implements Serializable {
    /**
     * 项目ID
     */
    private Integer workId;

    /**
     * 项目名字
     */
    private String name;

    /**
     * 状态 1启用 3归档 2 删除
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 描述
     */
    private String description;

    /**
     * 颜色
     */
    private String color;

    /**
     * 是否所有人可见 1 是 0 否
     */
    private Integer isOpen;

    /**
     * 项目成员
     */
    private String ownerUserId;

    /**
     * 归档时间
     */
    private Date archiveTime;

    /**
     * 删除时间
     */
    private Date deleteTime;

    private String batchId;

    private static final long serialVersionUID = 1L;
}