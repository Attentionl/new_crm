package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminField;
import com.sxu.crm.basic.domain.AdminFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminFieldMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminFieldMapper {
    long countByExample(AdminFieldExample example);

    int deleteByExample(AdminFieldExample example);

    int deleteByPrimaryKey(Integer fieldId);

    int insert(AdminField record);

    int insertSelective(AdminField record);

    List<AdminField> selectByExample(AdminFieldExample example);

    AdminField selectByPrimaryKey(Integer fieldId);

    int updateByExampleSelective(@Param("record") AdminField record, @Param("example") AdminFieldExample example);

    int updateByExample(@Param("record") AdminField record, @Param("example") AdminFieldExample example);

    int updateByPrimaryKeySelective(AdminField record);

    int updateByPrimaryKey(AdminField record);
}