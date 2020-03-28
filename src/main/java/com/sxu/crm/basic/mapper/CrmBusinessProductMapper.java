package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmBusinessProduct;
import com.sxu.crm.basic.domain.CrmBusinessProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmBusinessProductMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmBusinessProductMapper {
    long countByExample(CrmBusinessProductExample example);

    int deleteByExample(CrmBusinessProductExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(CrmBusinessProduct record);

    int insertSelective(CrmBusinessProduct record);

    List<CrmBusinessProduct> selectByExample(CrmBusinessProductExample example);

    CrmBusinessProduct selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") CrmBusinessProduct record, @Param("example") CrmBusinessProductExample example);

    int updateByExample(@Param("record") CrmBusinessProduct record, @Param("example") CrmBusinessProductExample example);

    int updateByPrimaryKeySelective(CrmBusinessProduct record);

    int updateByPrimaryKey(CrmBusinessProduct record);
}