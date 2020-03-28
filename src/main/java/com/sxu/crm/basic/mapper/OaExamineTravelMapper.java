package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaExamineTravel;
import com.sxu.crm.basic.domain.OaExamineTravelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaExamineTravelMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaExamineTravelMapper {
    long countByExample(OaExamineTravelExample example);

    int deleteByExample(OaExamineTravelExample example);

    int deleteByPrimaryKey(Integer travelId);

    int insert(OaExamineTravel record);

    int insertSelective(OaExamineTravel record);

    List<OaExamineTravel> selectByExample(OaExamineTravelExample example);

    OaExamineTravel selectByPrimaryKey(Integer travelId);

    int updateByExampleSelective(@Param("record") OaExamineTravel record, @Param("example") OaExamineTravelExample example);

    int updateByExample(@Param("record") OaExamineTravel record, @Param("example") OaExamineTravelExample example);

    int updateByPrimaryKeySelective(OaExamineTravel record);

    int updateByPrimaryKey(OaExamineTravel record);
}