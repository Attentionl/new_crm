package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaExamineStep;
import com.sxu.crm.basic.domain.OaExamineStepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaExamineStepMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaExamineStepMapper {
    long countByExample(OaExamineStepExample example);

    int deleteByExample(OaExamineStepExample example);

    int deleteByPrimaryKey(Integer stepId);

    int insert(OaExamineStep record);

    int insertSelective(OaExamineStep record);

    List<OaExamineStep> selectByExample(OaExamineStepExample example);

    OaExamineStep selectByPrimaryKey(Integer stepId);

    int updateByExampleSelective(@Param("record") OaExamineStep record, @Param("example") OaExamineStepExample example);

    int updateByExample(@Param("record") OaExamineStep record, @Param("example") OaExamineStepExample example);

    int updateByPrimaryKeySelective(OaExamineStep record);

    int updateByPrimaryKey(OaExamineStep record);
}