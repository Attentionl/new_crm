package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaAnnouncement;
import com.sxu.crm.basic.domain.OaAnnouncementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaAnnouncementMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaAnnouncementMapper {
    long countByExample(OaAnnouncementExample example);

    int deleteByExample(OaAnnouncementExample example);

    int deleteByPrimaryKey(Integer announcementId);

    int insert(OaAnnouncement record);

    int insertSelective(OaAnnouncement record);

    List<OaAnnouncement> selectByExample(OaAnnouncementExample example);

    OaAnnouncement selectByPrimaryKey(Integer announcementId);

    int updateByExampleSelective(@Param("record") OaAnnouncement record, @Param("example") OaAnnouncementExample example);

    int updateByExample(@Param("record") OaAnnouncement record, @Param("example") OaAnnouncementExample example);

    int updateByPrimaryKeySelective(OaAnnouncement record);

    int updateByPrimaryKey(OaAnnouncement record);
}