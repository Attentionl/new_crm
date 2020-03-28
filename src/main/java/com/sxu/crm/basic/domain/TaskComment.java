package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className TaskComment
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class TaskComment implements Serializable {
    /**
     * 评论表
     */
    private Integer commentId;

    /**
     * 评论人ID
     */
    private Long userId;

    /**
     * 内容(答案)
     */
    private String content;

    /**
     * 新建时间
     */
    private Date createTime;

    /**
     * 主评论的id
     */
    private Integer mainId;

    /**
     * 回复对象ID
     */
    private Long pid;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 评论项目任务ID 或评论其他模块ID
     */
    private Integer typeId;

    /**
     * 赞
     */
    private Integer favour;

    /**
     * 评论分类 1：任务评论  2：日志评论
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}