package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmLeads;
import com.sxu.crm.basic.domain.CrmLeadsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmLeadsMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmLeadsMapper {
    long countByExample(CrmLeadsExample example);

    int deleteByExample(CrmLeadsExample example);

    int deleteByPrimaryKey(Integer leadsId);

    int insert(CrmLeads record);

    int insertSelective(CrmLeads record);

    List<CrmLeads> selectByExample(CrmLeadsExample example);

    CrmLeads selectByPrimaryKey(Integer leadsId);

    int updateByExampleSelective(@Param("record") CrmLeads record, @Param("example") CrmLeadsExample example);

    int updateByExample(@Param("record") CrmLeads record, @Param("example") CrmLeadsExample example);

    int updateByPrimaryKeySelective(CrmLeads record);

    int updateByPrimaryKey(CrmLeads record);
}