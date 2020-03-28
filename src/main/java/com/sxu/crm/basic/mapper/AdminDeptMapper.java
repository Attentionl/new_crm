package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminDept;
import com.sxu.crm.basic.domain.AdminDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminDeptMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminDeptMapper {
    long countByExample(AdminDeptExample example);

    int deleteByExample(AdminDeptExample example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(AdminDept record);

    int insertSelective(AdminDept record);

    List<AdminDept> selectByExample(AdminDeptExample example);

    AdminDept selectByPrimaryKey(Integer deptId);

    int updateByExampleSelective(@Param("record") AdminDept record, @Param("example") AdminDeptExample example);

    int updateByExample(@Param("record") AdminDept record, @Param("example") AdminDeptExample example);

    int updateByPrimaryKeySelective(AdminDept record);

    int updateByPrimaryKey(AdminDept record);
}