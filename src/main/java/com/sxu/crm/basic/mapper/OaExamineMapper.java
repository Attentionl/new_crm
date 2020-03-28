package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaExamine;
import com.sxu.crm.basic.domain.OaExamineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaExamineMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaExamineMapper {
    long countByExample(OaExamineExample example);

    int deleteByExample(OaExamineExample example);

    int deleteByPrimaryKey(Integer examineId);

    int insert(OaExamine record);

    int insertSelective(OaExamine record);

    List<OaExamine> selectByExample(OaExamineExample example);

    OaExamine selectByPrimaryKey(Integer examineId);

    int updateByExampleSelective(@Param("record") OaExamine record, @Param("example") OaExamineExample example);

    int updateByExample(@Param("record") OaExamine record, @Param("example") OaExamineExample example);

    int updateByPrimaryKeySelective(OaExamine record);

    int updateByPrimaryKey(OaExamine record);
}