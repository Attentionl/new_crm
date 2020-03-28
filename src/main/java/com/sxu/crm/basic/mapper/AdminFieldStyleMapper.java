package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminFieldStyle;
import com.sxu.crm.basic.domain.AdminFieldStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminFieldStyleMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminFieldStyleMapper {
    long countByExample(AdminFieldStyleExample example);

    int deleteByExample(AdminFieldStyleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminFieldStyle record);

    int insertSelective(AdminFieldStyle record);

    List<AdminFieldStyle> selectByExample(AdminFieldStyleExample example);

    AdminFieldStyle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminFieldStyle record, @Param("example") AdminFieldStyleExample example);

    int updateByExample(@Param("record") AdminFieldStyle record, @Param("example") AdminFieldStyleExample example);

    int updateByPrimaryKeySelective(AdminFieldStyle record);

    int updateByPrimaryKey(AdminFieldStyle record);
}