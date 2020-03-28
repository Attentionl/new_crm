package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmCustomerStats;
import com.sxu.crm.basic.domain.CrmCustomerStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmCustomerStatsMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmCustomerStatsMapper {
    long countByExample(CrmCustomerStatsExample example);

    int deleteByExample(CrmCustomerStatsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmCustomerStats record);

    int insertSelective(CrmCustomerStats record);

    List<CrmCustomerStats> selectByExample(CrmCustomerStatsExample example);

    CrmCustomerStats selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmCustomerStats record, @Param("example") CrmCustomerStatsExample example);

    int updateByExample(@Param("record") CrmCustomerStats record, @Param("example") CrmCustomerStatsExample example);

    int updateByPrimaryKeySelective(CrmCustomerStats record);

    int updateByPrimaryKey(CrmCustomerStats record);
}