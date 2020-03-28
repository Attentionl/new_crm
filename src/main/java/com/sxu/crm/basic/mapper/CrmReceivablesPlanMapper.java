package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmReceivablesPlan;
import com.sxu.crm.basic.domain.CrmReceivablesPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmReceivablesPlanMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmReceivablesPlanMapper {
    long countByExample(CrmReceivablesPlanExample example);

    int deleteByExample(CrmReceivablesPlanExample example);

    int deleteByPrimaryKey(Integer planId);

    int insert(CrmReceivablesPlan record);

    int insertSelective(CrmReceivablesPlan record);

    List<CrmReceivablesPlan> selectByExample(CrmReceivablesPlanExample example);

    CrmReceivablesPlan selectByPrimaryKey(Integer planId);

    int updateByExampleSelective(@Param("record") CrmReceivablesPlan record, @Param("example") CrmReceivablesPlanExample example);

    int updateByExample(@Param("record") CrmReceivablesPlan record, @Param("example") CrmReceivablesPlanExample example);

    int updateByPrimaryKeySelective(CrmReceivablesPlan record);

    int updateByPrimaryKey(CrmReceivablesPlan record);
}