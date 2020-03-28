package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmBusinessType;
import com.sxu.crm.basic.domain.CrmBusinessTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmBusinessTypeMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmBusinessTypeMapper {
    long countByExample(CrmBusinessTypeExample example);

    int deleteByExample(CrmBusinessTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(CrmBusinessType record);

    int insertSelective(CrmBusinessType record);

    List<CrmBusinessType> selectByExample(CrmBusinessTypeExample example);

    CrmBusinessType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") CrmBusinessType record, @Param("example") CrmBusinessTypeExample example);

    int updateByExample(@Param("record") CrmBusinessType record, @Param("example") CrmBusinessTypeExample example);

    int updateByPrimaryKeySelective(CrmBusinessType record);

    int updateByPrimaryKey(CrmBusinessType record);
}