package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminConfig
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminConfig implements Serializable {
    private Integer settingId;

    /**
     * 状态，0:不启用 1 ： 启用
     */
    private Integer status;

    /**
     * 设置名称
     */
    private String name;

    /**
     * 值
     */
    private String value;

    /**
     * 描述
     */
    private String description;

    private static final long serialVersionUID = 1L;
}