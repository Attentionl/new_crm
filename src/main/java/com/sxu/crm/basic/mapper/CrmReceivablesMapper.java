package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmReceivables;
import com.sxu.crm.basic.domain.CrmReceivablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmReceivablesMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmReceivablesMapper {
    long countByExample(CrmReceivablesExample example);

    int deleteByExample(CrmReceivablesExample example);

    int deleteByPrimaryKey(Integer receivablesId);

    int insert(CrmReceivables record);

    int insertSelective(CrmReceivables record);

    List<CrmReceivables> selectByExample(CrmReceivablesExample example);

    CrmReceivables selectByPrimaryKey(Integer receivablesId);

    int updateByExampleSelective(@Param("record") CrmReceivables record, @Param("example") CrmReceivablesExample example);

    int updateByExample(@Param("record") CrmReceivables record, @Param("example") CrmReceivablesExample example);

    int updateByPrimaryKeySelective(CrmReceivables record);

    int updateByPrimaryKey(CrmReceivables record);
}