package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmBusinessStatus;
import com.sxu.crm.basic.domain.CrmBusinessStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmBusinessStatusMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmBusinessStatusMapper {
    long countByExample(CrmBusinessStatusExample example);

    int deleteByExample(CrmBusinessStatusExample example);

    int deleteByPrimaryKey(Integer statusId);

    int insert(CrmBusinessStatus record);

    int insertSelective(CrmBusinessStatus record);

    List<CrmBusinessStatus> selectByExample(CrmBusinessStatusExample example);

    CrmBusinessStatus selectByPrimaryKey(Integer statusId);

    int updateByExampleSelective(@Param("record") CrmBusinessStatus record, @Param("example") CrmBusinessStatusExample example);

    int updateByExample(@Param("record") CrmBusinessStatus record, @Param("example") CrmBusinessStatusExample example);

    int updateByPrimaryKeySelective(CrmBusinessStatus record);

    int updateByPrimaryKey(CrmBusinessStatus record);
}