package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmOwnerRecord
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmOwnerRecord implements Serializable {
    private Integer recordId;

    /**
     * 对象id
     */
    private Integer typeId;

    /**
     * 对象类型
     */
    private Integer type;

    /**
     * 上一负责人
     */
    private Long preOwnerUserId;

    /**
     * 接手负责人
     */
    private Long postOwnerUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}