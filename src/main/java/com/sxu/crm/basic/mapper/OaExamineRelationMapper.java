package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaExamineRelation;
import com.sxu.crm.basic.domain.OaExamineRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaExamineRelationMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaExamineRelationMapper {
    long countByExample(OaExamineRelationExample example);

    int deleteByExample(OaExamineRelationExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(OaExamineRelation record);

    int insertSelective(OaExamineRelation record);

    List<OaExamineRelation> selectByExample(OaExamineRelationExample example);

    OaExamineRelation selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") OaExamineRelation record, @Param("example") OaExamineRelationExample example);

    int updateByExample(@Param("record") OaExamineRelation record, @Param("example") OaExamineRelationExample example);

    int updateByPrimaryKeySelective(OaExamineRelation record);

    int updateByPrimaryKey(OaExamineRelation record);
}