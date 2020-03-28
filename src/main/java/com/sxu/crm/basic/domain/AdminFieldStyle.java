package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminFieldStyle
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminFieldStyle implements Serializable {
    /**
     * 样式表id
     */
    private Long id;

    /**
     * 字段宽度
     */
    private Integer style;

    /**
     * 字段类型 '1 线索 2 客户 3 联系人 4 产品 5 商机 6 合同 7回款 8公海'
     */
    private Integer type;

    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 用户id
     */
    private Long userId;

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