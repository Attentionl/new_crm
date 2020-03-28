package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmContactsBusiness
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmContactsBusiness implements Serializable {
    private Integer id;

    private Integer businessId;

    private Integer contactsId;

    private static final long serialVersionUID = 1L;
}