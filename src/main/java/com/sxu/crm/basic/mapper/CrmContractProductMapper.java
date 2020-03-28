package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmContractProduct;
import com.sxu.crm.basic.domain.CrmContractProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmContractProductMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmContractProductMapper {
    long countByExample(CrmContractProductExample example);

    int deleteByExample(CrmContractProductExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(CrmContractProduct record);

    int insertSelective(CrmContractProduct record);

    List<CrmContractProduct> selectByExample(CrmContractProductExample example);

    CrmContractProduct selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") CrmContractProduct record, @Param("example") CrmContractProductExample example);

    int updateByExample(@Param("record") CrmContractProduct record, @Param("example") CrmContractProductExample example);

    int updateByPrimaryKeySelective(CrmContractProduct record);

    int updateByPrimaryKey(CrmContractProduct record);
}