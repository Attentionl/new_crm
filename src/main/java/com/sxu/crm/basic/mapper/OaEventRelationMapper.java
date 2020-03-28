package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaEventRelation;
import com.sxu.crm.basic.domain.OaEventRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaEventRelationMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaEventRelationMapper {
    long countByExample(OaEventRelationExample example);

    int deleteByExample(OaEventRelationExample example);

    int deleteByPrimaryKey(Integer eventrelationId);

    int insert(OaEventRelation record);

    int insertSelective(OaEventRelation record);

    List<OaEventRelation> selectByExample(OaEventRelationExample example);

    OaEventRelation selectByPrimaryKey(Integer eventrelationId);

    int updateByExampleSelective(@Param("record") OaEventRelation record, @Param("example") OaEventRelationExample example);

    int updateByExample(@Param("record") OaEventRelation record, @Param("example") OaEventRelationExample example);

    int updateByPrimaryKeySelective(OaEventRelation record);

    int updateByPrimaryKey(OaEventRelation record);
}