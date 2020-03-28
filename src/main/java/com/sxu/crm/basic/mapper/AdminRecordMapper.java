package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminRecord;
import com.sxu.crm.basic.domain.AdminRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminRecordMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminRecordMapper {
    long countByExample(AdminRecordExample example);

    int deleteByExample(AdminRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(AdminRecord record);

    int insertSelective(AdminRecord record);

    List<AdminRecord> selectByExample(AdminRecordExample example);

    AdminRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") AdminRecord record, @Param("example") AdminRecordExample example);

    int updateByExample(@Param("record") AdminRecord record, @Param("example") AdminRecordExample example);

    int updateByPrimaryKeySelective(AdminRecord record);

    int updateByPrimaryKey(AdminRecord record);
}