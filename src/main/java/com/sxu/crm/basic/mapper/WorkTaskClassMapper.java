package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.WorkTaskClass;
import com.sxu.crm.basic.domain.WorkTaskClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className WorkTaskClassMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface WorkTaskClassMapper {
    long countByExample(WorkTaskClassExample example);

    int deleteByExample(WorkTaskClassExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(WorkTaskClass record);

    int insertSelective(WorkTaskClass record);

    List<WorkTaskClass> selectByExample(WorkTaskClassExample example);

    WorkTaskClass selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") WorkTaskClass record, @Param("example") WorkTaskClassExample example);

    int updateByExample(@Param("record") WorkTaskClass record, @Param("example") WorkTaskClassExample example);

    int updateByPrimaryKeySelective(WorkTaskClass record);

    int updateByPrimaryKey(WorkTaskClass record);
}