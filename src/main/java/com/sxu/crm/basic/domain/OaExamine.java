package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className OaExamine
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class OaExamine implements Serializable {
    private Integer examineId;

    /**
     * 审批类型
     */
    private Integer categoryId;

    /**
     * 内容
     */
    private String content;

    /**
     * 备注
     */
    private String remark;

    /**
     * 请假类型
     */
    private String typeId;

    /**
     * 差旅、报销总金额
     */
    private BigDecimal money;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 时长
     */
    private BigDecimal duration;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 附件批次id
     */
    private String batchId;

    private static final long serialVersionUID = 1L;
}