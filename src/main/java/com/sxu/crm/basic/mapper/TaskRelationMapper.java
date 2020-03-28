package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.TaskRelation;
import com.sxu.crm.basic.domain.TaskRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className TaskRelationMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface TaskRelationMapper {
    long countByExample(TaskRelationExample example);

    int deleteByExample(TaskRelationExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(TaskRelation record);

    int insertSelective(TaskRelation record);

    List<TaskRelation> selectByExample(TaskRelationExample example);

    TaskRelation selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") TaskRelation record, @Param("example") TaskRelationExample example);

    int updateByExample(@Param("record") TaskRelation record, @Param("example") TaskRelationExample example);

    int updateByPrimaryKeySelective(TaskRelation record);

    int updateByPrimaryKey(TaskRelation record);
}