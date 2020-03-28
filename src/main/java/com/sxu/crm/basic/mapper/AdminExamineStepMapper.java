package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminExamineStep;
import com.sxu.crm.basic.domain.AdminExamineStepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminExamineStepMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminExamineStepMapper {
    long countByExample(AdminExamineStepExample example);

    int deleteByExample(AdminExamineStepExample example);

    int deleteByPrimaryKey(Long stepId);

    int insert(AdminExamineStep record);

    int insertSelective(AdminExamineStep record);

    List<AdminExamineStep> selectByExample(AdminExamineStepExample example);

    AdminExamineStep selectByPrimaryKey(Long stepId);

    int updateByExampleSelective(@Param("record") AdminExamineStep record, @Param("example") AdminExamineStepExample example);

    int updateByExample(@Param("record") AdminExamineStep record, @Param("example") AdminExamineStepExample example);

    int updateByPrimaryKeySelective(AdminExamineStep record);

    int updateByPrimaryKey(AdminExamineStep record);
}