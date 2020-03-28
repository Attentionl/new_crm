package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaExamineLog;
import com.sxu.crm.basic.domain.OaExamineLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaExamineLogMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaExamineLogMapper {
    long countByExample(OaExamineLogExample example);

    int deleteByExample(OaExamineLogExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(OaExamineLog record);

    int insertSelective(OaExamineLog record);

    List<OaExamineLog> selectByExample(OaExamineLogExample example);

    OaExamineLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") OaExamineLog record, @Param("example") OaExamineLogExample example);

    int updateByExample(@Param("record") OaExamineLog record, @Param("example") OaExamineLogExample example);

    int updateByPrimaryKeySelective(OaExamineLog record);

    int updateByPrimaryKey(OaExamineLog record);
}