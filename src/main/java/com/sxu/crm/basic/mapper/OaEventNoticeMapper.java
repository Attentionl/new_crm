package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaEventNotice;
import com.sxu.crm.basic.domain.OaEventNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaEventNoticeMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaEventNoticeMapper {
    long countByExample(OaEventNoticeExample example);

    int deleteByExample(OaEventNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OaEventNotice record);

    int insertSelective(OaEventNotice record);

    List<OaEventNotice> selectByExample(OaEventNoticeExample example);

    OaEventNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OaEventNotice record, @Param("example") OaEventNoticeExample example);

    int updateByExample(@Param("record") OaEventNotice record, @Param("example") OaEventNoticeExample example);

    int updateByPrimaryKeySelective(OaEventNotice record);

    int updateByPrimaryKey(OaEventNotice record);
}