package com.sxu.crm.basic.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminFieldSort
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminFieldSort implements Serializable {
    /**
     * 字段id
     */
    private Integer id;

    /**
     * 标签 1 线索 2 客户 3 联系人 4 产品 5 商机 6 合同 7回款 8公海
     */
    private Integer label;

    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 字段中文名称
     */
    private String name;

    /**
     * 字段类型 1 单行文本 2 多行文本 3 单选 4日期 5 数字 6 小数 7 手机  8 文件 9 多选 10 人员 11 附件 12 部门 13 日期时间 14 邮箱 15客户 16 商机 17 联系人 18 地图 19 产品类型 20 合同 21 回款计划
     */
    private Integer type;

    /**
     * 字段排序
     */
    private Integer sort;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 是否隐藏 0、不隐藏 1、隐藏
     */
    private Integer isHide;

    private Integer fieldId;

    private static final long serialVersionUID = 1L;
}