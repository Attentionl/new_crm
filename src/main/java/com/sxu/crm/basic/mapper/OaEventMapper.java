package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaEvent;
import com.sxu.crm.basic.domain.OaEventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaEventMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaEventMapper {
    long countByExample(OaEventExample example);

    int deleteByExample(OaEventExample example);

    int deleteByPrimaryKey(Integer eventId);

    int insert(OaEvent record);

    int insertSelective(OaEvent record);

    List<OaEvent> selectByExample(OaEventExample example);

    OaEvent selectByPrimaryKey(Integer eventId);

    int updateByExampleSelective(@Param("record") OaEvent record, @Param("example") OaEventExample example);

    int updateByExample(@Param("record") OaEvent record, @Param("example") OaEventExample example);

    int updateByPrimaryKeySelective(OaEvent record);

    int updateByPrimaryKey(OaEvent record);
}