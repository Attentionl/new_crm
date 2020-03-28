package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmActionRecord;
import com.sxu.crm.basic.domain.CrmActionRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmActionRecordMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmActionRecordMapper {
    long countByExample(CrmActionRecordExample example);

    int deleteByExample(CrmActionRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmActionRecord record);

    int insertSelective(CrmActionRecord record);

    List<CrmActionRecord> selectByExample(CrmActionRecordExample example);

    CrmActionRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmActionRecord record, @Param("example") CrmActionRecordExample example);

    int updateByExample(@Param("record") CrmActionRecord record, @Param("example") CrmActionRecordExample example);

    int updateByPrimaryKeySelective(CrmActionRecord record);

    int updateByPrimaryKey(CrmActionRecord record);
}