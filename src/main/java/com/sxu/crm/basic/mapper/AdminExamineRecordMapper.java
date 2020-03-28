package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminExamineRecord;
import com.sxu.crm.basic.domain.AdminExamineRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminExamineRecordMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminExamineRecordMapper {
    long countByExample(AdminExamineRecordExample example);

    int deleteByExample(AdminExamineRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(AdminExamineRecord record);

    int insertSelective(AdminExamineRecord record);

    List<AdminExamineRecord> selectByExample(AdminExamineRecordExample example);

    AdminExamineRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") AdminExamineRecord record, @Param("example") AdminExamineRecordExample example);

    int updateByExample(@Param("record") AdminExamineRecord record, @Param("example") AdminExamineRecordExample example);

    int updateByPrimaryKeySelective(AdminExamineRecord record);

    int updateByPrimaryKey(AdminExamineRecord record);
}