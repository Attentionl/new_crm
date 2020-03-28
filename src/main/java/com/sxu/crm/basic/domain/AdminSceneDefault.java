package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminSceneDefault
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminSceneDefault implements Serializable {
    private Integer defaultId;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 人员ID
     */
    private Long userId;

    /**
     * 场景ID
     */
    private Integer sceneId;

    private static final long serialVersionUID = 1L;
}