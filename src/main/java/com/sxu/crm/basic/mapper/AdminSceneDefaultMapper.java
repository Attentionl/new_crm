package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminSceneDefault;
import com.sxu.crm.basic.domain.AdminSceneDefaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminSceneDefaultMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminSceneDefaultMapper {
    long countByExample(AdminSceneDefaultExample example);

    int deleteByExample(AdminSceneDefaultExample example);

    int deleteByPrimaryKey(Integer defaultId);

    int insert(AdminSceneDefault record);

    int insertSelective(AdminSceneDefault record);

    List<AdminSceneDefault> selectByExample(AdminSceneDefaultExample example);

    AdminSceneDefault selectByPrimaryKey(Integer defaultId);

    int updateByExampleSelective(@Param("record") AdminSceneDefault record, @Param("example") AdminSceneDefaultExample example);

    int updateByExample(@Param("record") AdminSceneDefault record, @Param("example") AdminSceneDefaultExample example);

    int updateByPrimaryKeySelective(AdminSceneDefault record);

    int updateByPrimaryKey(AdminSceneDefault record);
}