package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminField
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminField implements Serializable {
    /**
     * 主键ID
     */
    private Integer fieldId;

    /**
     * 自定义字段英文标识
     */
    private String fieldName;

    /**
     * 字段名称
     */
    private String name;

    /**
     * 字段类型 1 单行文本 2 多行文本 3 单选 4日期 5 数字 6 小数 7 手机  8 文件 9 多选 10 人员 11 附件 12 部门 13 日期时间 14 邮箱 15客户 16 商机 17 联系人 18 地图 19 产品类型 20 合同 21 回款计划
     */
    private Integer type;

    /**
     * 标签 1 线索 2 客户 3 联系人 4 产品 5 商机 6 合同 7回款8.回款计划
     */
    private Integer label;

    /**
     * 字段说明
     */
    private String remark;

    /**
     * 输入提示
     */
    private String inputTips;

    /**
     * 最大长度
     */
    private Integer maxLength;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 是否唯一 1 是 0 否
     */
    private Integer isUnique;

    /**
     * 是否必填 1 是 0 否
     */
    private Integer isNull;

    /**
     * 排序 从小到大
     */
    private Integer sorting;

    /**
     * 如果类型是选项，此处不能为空，多个选项以，隔开
     */
    private String options;

    /**
     * 是否可以删除修改 0 改删 1 改 2 删 3 无
     */
    private Integer operating;

    /**
     * 最后修改时间
     */
    private Date updateTime;

    /**
     * 审批ID label为10需要
     */
    private Integer examineCategoryId;

    /**
     * 是否是自定义字段  0.自定义 1.固定
     */
    private Integer fieldType;

    /**
     * 只有线索需要，装换客户的自定义字段ID
     */
    private Integer relevant;

    private static final long serialVersionUID = 1L;
}