package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className OaExamineTravel
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class OaExamineTravel implements Serializable {
    private Integer travelId;

    /**
     * 审批ID
     */
    private Integer examineId;

    /**
     * 出发地
     */
    private String startAddress;

    /**
     * 出发时间
     */
    private Date startTime;

    /**
     * 目的地
     */
    private String endAddress;

    /**
     * 到达时间
     */
    private Date endTime;

    /**
     * 交通费
     */
    private BigDecimal traffic;

    /**
     * 住宿费
     */
    private BigDecimal stay;

    /**
     * 餐饮费
     */
    private BigDecimal diet;

    /**
     * 其他费用
     */
    private BigDecimal other;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 交通工具
     */
    private String vehicle;

    /**
     * 单程往返（单程、往返）
     */
    private String trip;

    /**
     * 时长
     */
    private BigDecimal duration;

    /**
     * 备注
     */
    private String description;

    /**
     * 批次id
     */
    private String batchId;

    private static final long serialVersionUID = 1L;
}