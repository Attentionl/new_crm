package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmProductCategory
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmProductCategory implements Serializable {
    private Integer categoryId;

    private String name;

    private Integer pid;

    private static final long serialVersionUID = 1L;
}