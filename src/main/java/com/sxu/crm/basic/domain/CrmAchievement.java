package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmAchievement
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmAchievement implements Serializable {
    private Integer achievementId;

    /**
     * 对象ID
     */
    private Integer objId;

    /**
     * 1公司2部门3员工
     */
    private Integer type;

    /**
     * 年
     */
    private String year;

    /**
     * 一月
     */
    private BigDecimal january;

    /**
     * 二月
     */
    private BigDecimal february;

    /**
     * 三月
     */
    private BigDecimal march;

    /**
     * 四月
     */
    private BigDecimal april;

    /**
     * 五月
     */
    private BigDecimal may;

    /**
     * 六月
     */
    private BigDecimal june;

    /**
     * 七月
     */
    private BigDecimal july;

    /**
     * 八月
     */
    private BigDecimal august;

    /**
     * 九月
     */
    private BigDecimal september;

    /**
     * 十月
     */
    private BigDecimal october;

    /**
     * 十一月
     */
    private BigDecimal november;

    /**
     * 十二月
     */
    private BigDecimal december;

    /**
     * 1销售（目标）2回款（目标）
     */
    private Integer status;

    /**
     * 年目标
     */
    private BigDecimal yeartarget;

    private static final long serialVersionUID = 1L;
}