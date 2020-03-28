package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className CrmArea
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class CrmArea implements Serializable {
    private Integer codeId;

    private Integer parentId;

    private String cityName;

    private static final long serialVersionUID = 1L;
}