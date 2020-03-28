package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminScene;
import com.sxu.crm.basic.domain.AdminSceneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminSceneMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminSceneMapper {
    long countByExample(AdminSceneExample example);

    int deleteByExample(AdminSceneExample example);

    int deleteByPrimaryKey(Integer sceneId);

    int insert(AdminScene record);

    int insertSelective(AdminScene record);

    List<AdminScene> selectByExample(AdminSceneExample example);

    AdminScene selectByPrimaryKey(Integer sceneId);

    int updateByExampleSelective(@Param("record") AdminScene record, @Param("example") AdminSceneExample example);

    int updateByExample(@Param("record") AdminScene record, @Param("example") AdminSceneExample example);

    int updateByPrimaryKeySelective(AdminScene record);

    int updateByPrimaryKey(AdminScene record);
}