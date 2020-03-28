package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminExamineLog;
import com.sxu.crm.basic.domain.AdminExamineLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminExamineLogMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminExamineLogMapper {
    long countByExample(AdminExamineLogExample example);

    int deleteByExample(AdminExamineLogExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(AdminExamineLog record);

    int insertSelective(AdminExamineLog record);

    List<AdminExamineLog> selectByExample(AdminExamineLogExample example);

    AdminExamineLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") AdminExamineLog record, @Param("example") AdminExamineLogExample example);

    int updateByExample(@Param("record") AdminExamineLog record, @Param("example") AdminExamineLogExample example);

    int updateByPrimaryKeySelective(AdminExamineLog record);

    int updateByPrimaryKey(AdminExamineLog record);
}