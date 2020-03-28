package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 李今朝
 * @className AdminFile
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminFile implements Serializable {
    private Integer fileId;

    /**
     * 附件名称
     */
    private String name;

    /**
     * 附件大小（字节）
     */
    private Integer size;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 文件真实路径
     */
    private String path;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 批次id
     */
    private String batchId;

    private static final long serialVersionUID = 1L;
}