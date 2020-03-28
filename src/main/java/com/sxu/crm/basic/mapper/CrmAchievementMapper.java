package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmAchievement;
import com.sxu.crm.basic.domain.CrmAchievementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmAchievementMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmAchievementMapper {
    long countByExample(CrmAchievementExample example);

    int deleteByExample(CrmAchievementExample example);

    int deleteByPrimaryKey(Integer achievementId);

    int insert(CrmAchievement record);

    int insertSelective(CrmAchievement record);

    List<CrmAchievement> selectByExample(CrmAchievementExample example);

    CrmAchievement selectByPrimaryKey(Integer achievementId);

    int updateByExampleSelective(@Param("record") CrmAchievement record, @Param("example") CrmAchievementExample example);

    int updateByExample(@Param("record") CrmAchievement record, @Param("example") CrmAchievementExample example);

    int updateByPrimaryKeySelective(CrmAchievement record);

    int updateByPrimaryKey(CrmAchievement record);
}