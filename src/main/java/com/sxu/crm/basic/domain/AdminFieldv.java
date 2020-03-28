package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminFieldv
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminFieldv implements Serializable {
    private Integer id;

    private Integer fieldId;

    /**
     * 字段名称
     */
    private String name;

    private String value;

    private Date createTime;

    private String batchId;

    private static final long serialVersionUID = 1L;
}