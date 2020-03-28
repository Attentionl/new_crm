package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminConfig;
import com.sxu.crm.basic.domain.AdminConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminConfigMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminConfigMapper {
    long countByExample(AdminConfigExample example);

    int deleteByExample(AdminConfigExample example);

    int deleteByPrimaryKey(Integer settingId);

    int insert(AdminConfig record);

    int insertSelective(AdminConfig record);

    List<AdminConfig> selectByExample(AdminConfigExample example);

    AdminConfig selectByPrimaryKey(Integer settingId);

    int updateByExampleSelective(@Param("record") AdminConfig record, @Param("example") AdminConfigExample example);

    int updateByExample(@Param("record") AdminConfig record, @Param("example") AdminConfigExample example);

    int updateByPrimaryKeySelective(AdminConfig record);

    int updateByPrimaryKey(AdminConfig record);
}