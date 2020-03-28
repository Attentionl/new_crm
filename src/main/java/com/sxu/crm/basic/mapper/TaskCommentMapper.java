package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.TaskComment;
import com.sxu.crm.basic.domain.TaskCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className TaskCommentMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface TaskCommentMapper {
    long countByExample(TaskCommentExample example);

    int deleteByExample(TaskCommentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(TaskComment record);

    int insertSelective(TaskComment record);

    List<TaskComment> selectByExample(TaskCommentExample example);

    TaskComment selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") TaskComment record, @Param("example") TaskCommentExample example);

    int updateByExample(@Param("record") TaskComment record, @Param("example") TaskCommentExample example);

    int updateByPrimaryKeySelective(TaskComment record);

    int updateByPrimaryKey(TaskComment record);
}