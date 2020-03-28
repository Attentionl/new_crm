package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaExamineCategory;
import com.sxu.crm.basic.domain.OaExamineCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaExamineCategoryMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaExamineCategoryMapper {
    long countByExample(OaExamineCategoryExample example);

    int deleteByExample(OaExamineCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(OaExamineCategory record);

    int insertSelective(OaExamineCategory record);

    List<OaExamineCategory> selectByExample(OaExamineCategoryExample example);

    OaExamineCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") OaExamineCategory record, @Param("example") OaExamineCategoryExample example);

    int updateByExample(@Param("record") OaExamineCategory record, @Param("example") OaExamineCategoryExample example);

    int updateByPrimaryKeySelective(OaExamineCategory record);

    int updateByPrimaryKey(OaExamineCategory record);
}