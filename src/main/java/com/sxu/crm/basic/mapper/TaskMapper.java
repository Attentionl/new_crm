package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.Task;
import com.sxu.crm.basic.domain.TaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className TaskMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface TaskMapper {
    long countByExample(TaskExample example);

    int deleteByExample(TaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(Task record);

    int insertSelective(Task record);

    List<Task> selectByExample(TaskExample example);

    Task selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByExample(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}