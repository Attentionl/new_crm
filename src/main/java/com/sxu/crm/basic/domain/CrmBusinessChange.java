package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmBusinessChange
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmBusinessChange implements Serializable {
    private Integer changeId;

    /**
     * 商机ID
     */
    private Integer businessId;

    /**
     * 阶段ID
     */
    private Integer statusId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Long createUserId;

    private static final long serialVersionUID = 1L;
}