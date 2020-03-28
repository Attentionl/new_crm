package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.WorkTaskLog;
import com.sxu.crm.basic.domain.WorkTaskLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className WorkTaskLogMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface WorkTaskLogMapper {
    long countByExample(WorkTaskLogExample example);

    int deleteByExample(WorkTaskLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(WorkTaskLog record);

    int insertSelective(WorkTaskLog record);

    List<WorkTaskLog> selectByExample(WorkTaskLogExample example);

    WorkTaskLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") WorkTaskLog record, @Param("example") WorkTaskLogExample example);

    int updateByExample(@Param("record") WorkTaskLog record, @Param("example") WorkTaskLogExample example);

    int updateByPrimaryKeySelective(WorkTaskLog record);

    int updateByPrimaryKey(WorkTaskLog record);
}