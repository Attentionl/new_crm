package com.sxu.crm.basic.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * @author 李今朝
 * @className AdminUser
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
@Data
public class AdminUser implements Serializable {
    /**
     * 主键
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 安全符
     */
    private String salt;

    /**
     * 头像
     */
    private String img;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 员工编号
     */
    private String num;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 0 未选择 1 男 2 女
     */
    private Integer sex;

    /**
     * 部门
     */
    private Integer deptId;

    /**
     * 岗位
     */
    private String post;

    /**
     * 状态,0禁用,1正常,2未激活
     */
    private Integer status;

    /**
     * 直属上级ID
     */
    private Long parentId;

    /**
     * 最后登录时间
     */
    private Date lastLoginTime;

    /**
     * 最后登录IP 注意兼容IPV6
     */
    private String lastLoginIp;

    private static final long serialVersionUID = 1L;

    //查询开始时间
    private String startTime;
    //查询结束时间
    private String endTime;
    //用户角色列表
    private List<Integer> roles;
}