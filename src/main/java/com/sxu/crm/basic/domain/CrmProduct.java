package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmProduct
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmProduct implements Serializable {
    private Integer productId;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 产品编码
     */
    private String num;

    /**
     * 单位
     */
    private String unit;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 状态 1 上架 0 下架 3 删除
     */
    private Integer status;

    /**
     * 产品分类ID
     */
    private Integer categoryId;

    /**
     * 产品描述
     */
    private String description;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 负责人ID
     */
    private Integer ownerUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 批次
     */
    private String batchId;

    private static final long serialVersionUID = 1L;
}