package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminScene
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminScene implements Serializable {
    private Integer sceneId;

    /**
     * 分类
     */
    private Integer type;

    /**
     * 场景名称
     */
    private String name;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 排序ID
     */
    private Integer sort;

    /**
     * 属性值
     */
    private String data;

    /**
     * 1隐藏
     */
    private Integer isHide;

    /**
     * 1系统0自定义
     */
    private Integer isSystem;

    /**
     * 系统参数
     */
    private String bydata;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}