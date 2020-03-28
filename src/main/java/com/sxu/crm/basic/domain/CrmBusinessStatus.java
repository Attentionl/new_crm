package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmBusinessStatus
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmBusinessStatus implements Serializable {
    private Integer statusId;

    /**
     * 商机状态类别ID
     */
    private Integer typeId;

    /**
     * 标识
     */
    private String name;

    /**
     * 赢单率
     */
    private String rate;

    /**
     * 排序
     */
    private Integer orderNum;

    private static final long serialVersionUID = 1L;
}