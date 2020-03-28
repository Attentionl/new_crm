package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmCustomerStats
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmCustomerStats implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 客户总数
     */
    private Integer customerNum;

    /**
     * 统计时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}