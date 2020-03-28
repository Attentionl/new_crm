package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.WorkUser;
import com.sxu.crm.basic.domain.WorkUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className WorkUserMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface WorkUserMapper {
    long countByExample(WorkUserExample example);

    int deleteByExample(WorkUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkUser record);

    int insertSelective(WorkUser record);

    List<WorkUser> selectByExample(WorkUserExample example);

    WorkUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkUser record, @Param("example") WorkUserExample example);

    int updateByExample(@Param("record") WorkUser record, @Param("example") WorkUserExample example);

    int updateByPrimaryKeySelective(WorkUser record);

    int updateByPrimaryKey(WorkUser record);
}