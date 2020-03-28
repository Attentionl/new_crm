package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmBusinessChange;
import com.sxu.crm.basic.domain.CrmBusinessChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmBusinessChangeMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmBusinessChangeMapper {
    long countByExample(CrmBusinessChangeExample example);

    int deleteByExample(CrmBusinessChangeExample example);

    int deleteByPrimaryKey(Integer changeId);

    int insert(CrmBusinessChange record);

    int insertSelective(CrmBusinessChange record);

    List<CrmBusinessChange> selectByExample(CrmBusinessChangeExample example);

    CrmBusinessChange selectByPrimaryKey(Integer changeId);

    int updateByExampleSelective(@Param("record") CrmBusinessChange record, @Param("example") CrmBusinessChangeExample example);

    int updateByExample(@Param("record") CrmBusinessChange record, @Param("example") CrmBusinessChangeExample example);

    int updateByPrimaryKeySelective(CrmBusinessChange record);

    int updateByPrimaryKey(CrmBusinessChange record);
}