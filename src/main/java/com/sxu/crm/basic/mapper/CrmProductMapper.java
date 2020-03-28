package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmProduct;
import com.sxu.crm.basic.domain.CrmProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmProductMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmProductMapper {
    long countByExample(CrmProductExample example);

    int deleteByExample(CrmProductExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(CrmProduct record);

    int insertSelective(CrmProduct record);

    List<CrmProduct> selectByExample(CrmProductExample example);

    CrmProduct selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") CrmProduct record, @Param("example") CrmProductExample example);

    int updateByExample(@Param("record") CrmProduct record, @Param("example") CrmProductExample example);

    int updateByPrimaryKeySelective(CrmProduct record);

    int updateByPrimaryKey(CrmProduct record);
}