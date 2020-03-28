package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaLogRelation;
import com.sxu.crm.basic.domain.OaLogRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaLogRelationMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaLogRelationMapper {
    long countByExample(OaLogRelationExample example);

    int deleteByExample(OaLogRelationExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(OaLogRelation record);

    int insertSelective(OaLogRelation record);

    List<OaLogRelation> selectByExample(OaLogRelationExample example);

    OaLogRelation selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") OaLogRelation record, @Param("example") OaLogRelationExample example);

    int updateByExample(@Param("record") OaLogRelation record, @Param("example") OaLogRelationExample example);

    int updateByPrimaryKeySelective(OaLogRelation record);

    int updateByPrimaryKey(OaLogRelation record);
}