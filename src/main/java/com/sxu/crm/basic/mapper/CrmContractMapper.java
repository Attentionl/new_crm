package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmContract;
import com.sxu.crm.basic.domain.CrmContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmContractMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmContractMapper {
    long countByExample(CrmContractExample example);

    int deleteByExample(CrmContractExample example);

    int deleteByPrimaryKey(Integer contractId);

    int insert(CrmContract record);

    int insertSelective(CrmContract record);

    List<CrmContract> selectByExample(CrmContractExample example);

    CrmContract selectByPrimaryKey(Integer contractId);

    int updateByExampleSelective(@Param("record") CrmContract record, @Param("example") CrmContractExample example);

    int updateByExample(@Param("record") CrmContract record, @Param("example") CrmContractExample example);

    int updateByPrimaryKeySelective(CrmContract record);

    int updateByPrimaryKey(CrmContract record);
}