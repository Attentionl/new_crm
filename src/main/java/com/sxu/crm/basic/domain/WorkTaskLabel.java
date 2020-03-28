package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className WorkTaskLabel
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class WorkTaskLabel implements Serializable {
    private Integer labelId;

    /**
     * 标签名
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
     * 状态
     */
    private Integer status;

    /**
     * 颜色
     */
    private String color;

    private static final long serialVersionUID = 1L;
}