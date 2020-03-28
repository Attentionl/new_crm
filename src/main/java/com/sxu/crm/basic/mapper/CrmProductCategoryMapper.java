package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmProductCategory;
import com.sxu.crm.basic.domain.CrmProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmProductCategoryMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmProductCategoryMapper {
    long countByExample(CrmProductCategoryExample example);

    int deleteByExample(CrmProductCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(CrmProductCategory record);

    int insertSelective(CrmProductCategory record);

    List<CrmProductCategory> selectByExample(CrmProductCategoryExample example);

    CrmProductCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") CrmProductCategory record, @Param("example") CrmProductCategoryExample example);

    int updateByExample(@Param("record") CrmProductCategory record, @Param("example") CrmProductCategoryExample example);

    int updateByPrimaryKeySelective(CrmProductCategory record);

    int updateByPrimaryKey(CrmProductCategory record);
}