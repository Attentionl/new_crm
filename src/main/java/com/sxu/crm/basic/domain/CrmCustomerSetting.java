package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmCustomerSetting
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmCustomerSetting implements Serializable {
    /**
     * 主键ID
     */
    private Integer settingId;

    /**
     * 规则名称
     */
    private String settingName;

    /**
     * 可拥有客户数量
     */
    private Integer customerNum;

    /**
     * 成交客户是否占用数量 0 不占用 1 占用
     */
    private Integer customerDeal;

    /**
     * 类型 1 拥有客户数限制 2 锁定客户数限制
     */
    private Integer type;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}