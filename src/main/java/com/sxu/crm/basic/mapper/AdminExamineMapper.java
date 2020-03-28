package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminExamine;
import com.sxu.crm.basic.domain.AdminExamineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminExamineMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminExamineMapper {
    long countByExample(AdminExamineExample example);

    int deleteByExample(AdminExamineExample example);

    int deleteByPrimaryKey(Integer examineId);

    int insert(AdminExamine record);

    int insertSelective(AdminExamine record);

    List<AdminExamine> selectByExample(AdminExamineExample example);

    AdminExamine selectByPrimaryKey(Integer examineId);

    int updateByExampleSelective(@Param("record") AdminExamine record, @Param("example") AdminExamineExample example);

    int updateByExample(@Param("record") AdminExamine record, @Param("example") AdminExamineExample example);

    int updateByPrimaryKeySelective(AdminExamine record);

    int updateByPrimaryKey(AdminExamine record);
}