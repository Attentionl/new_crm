package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmBusinessProduct
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmBusinessProduct implements Serializable {
    private Integer rId;

    /**
     * 商机ID
     */
    private Integer businessId;

    /**
     * 产品ID
     */
    private Integer productId;

    /**
     * 产品单价
     */
    private BigDecimal price;

    /**
     * 销售价格
     */
    private BigDecimal salesPrice;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 小计（折扣后价格）
     */
    private BigDecimal subtotal;

    /**
     * 单位
     */
    private String unit;

    private static final long serialVersionUID = 1L;
}