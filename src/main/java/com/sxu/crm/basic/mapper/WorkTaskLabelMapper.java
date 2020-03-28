package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.WorkTaskLabel;
import com.sxu.crm.basic.domain.WorkTaskLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className WorkTaskLabelMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface WorkTaskLabelMapper {
    long countByExample(WorkTaskLabelExample example);

    int deleteByExample(WorkTaskLabelExample example);

    int deleteByPrimaryKey(Integer labelId);

    int insert(WorkTaskLabel record);

    int insertSelective(WorkTaskLabel record);

    List<WorkTaskLabel> selectByExample(WorkTaskLabelExample example);

    WorkTaskLabel selectByPrimaryKey(Integer labelId);

    int updateByExampleSelective(@Param("record") WorkTaskLabel record, @Param("example") WorkTaskLabelExample example);

    int updateByExample(@Param("record") WorkTaskLabel record, @Param("example") WorkTaskLabelExample example);

    int updateByPrimaryKeySelective(WorkTaskLabel record);

    int updateByPrimaryKey(WorkTaskLabel record);
}