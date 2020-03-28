package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaActionRecord;
import com.sxu.crm.basic.domain.OaActionRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaActionRecordMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaActionRecordMapper {
    long countByExample(OaActionRecordExample example);

    int deleteByExample(OaActionRecordExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(OaActionRecord record);

    int insertSelective(OaActionRecord record);

    List<OaActionRecord> selectByExample(OaActionRecordExample example);

    OaActionRecord selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") OaActionRecord record, @Param("example") OaActionRecordExample example);

    int updateByExample(@Param("record") OaActionRecord record, @Param("example") OaActionRecordExample example);

    int updateByPrimaryKeySelective(OaActionRecord record);

    int updateByPrimaryKey(OaActionRecord record);
}