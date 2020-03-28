package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminMenu
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminMenu implements Serializable {
    /**
     * 菜单ID
     */
    private Integer menuId;

    /**
     * 上级菜单ID
     */
    private Integer parentId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 链接地址
     */
    private String realm;

    /**
     * 菜单类型  1目录 2 菜单 3 按钮 4特殊
     */
    private Integer menuType;

    /**
     * 排序（同级有效）
     */
    private Integer sort;

    /**
     * 状态 1 启用 0 禁用
     */
    private Integer status;

    /**
     * 菜单说明
     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}