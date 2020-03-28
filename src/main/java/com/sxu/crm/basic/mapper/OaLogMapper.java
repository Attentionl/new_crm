package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.OaLog;
import com.sxu.crm.basic.domain.OaLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className OaLogMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface OaLogMapper {
    long countByExample(OaLogExample example);

    int deleteByExample(OaLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(OaLog record);

    int insertSelective(OaLog record);

    List<OaLog> selectByExample(OaLogExample example);

    OaLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") OaLog record, @Param("example") OaLogExample example);

    int updateByExample(@Param("record") OaLog record, @Param("example") OaLogExample example);

    int updateByPrimaryKeySelective(OaLog record);

    int updateByPrimaryKey(OaLog record);
}