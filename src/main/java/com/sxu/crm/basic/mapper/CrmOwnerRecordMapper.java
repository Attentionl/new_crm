package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmOwnerRecord;
import com.sxu.crm.basic.domain.CrmOwnerRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmOwnerRecordMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmOwnerRecordMapper {
    long countByExample(CrmOwnerRecordExample example);

    int deleteByExample(CrmOwnerRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(CrmOwnerRecord record);

    int insertSelective(CrmOwnerRecord record);

    List<CrmOwnerRecord> selectByExample(CrmOwnerRecordExample example);

    CrmOwnerRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") CrmOwnerRecord record, @Param("example") CrmOwnerRecordExample example);

    int updateByExample(@Param("record") CrmOwnerRecord record, @Param("example") CrmOwnerRecordExample example);

    int updateByPrimaryKeySelective(CrmOwnerRecord record);

    int updateByPrimaryKey(CrmOwnerRecord record);
}