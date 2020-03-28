package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaExamineRecord;
import com.sxu.crm.basic.domain.OaExamineRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaExamineRecordMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaExamineRecordMapper {
    long countByExample(OaExamineRecordExample example);

    int deleteByExample(OaExamineRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(OaExamineRecord record);

    int insertSelective(OaExamineRecord record);

    List<OaExamineRecord> selectByExample(OaExamineRecordExample example);

    OaExamineRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") OaExamineRecord record, @Param("example") OaExamineRecordExample example);

    int updateByExample(@Param("record") OaExamineRecord record, @Param("example") OaExamineRecordExample example);

    int updateByPrimaryKeySelective(OaExamineRecord record);

    int updateByPrimaryKey(OaExamineRecord record);
}