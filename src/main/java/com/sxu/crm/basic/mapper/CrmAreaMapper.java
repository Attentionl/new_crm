package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmArea;
import com.sxu.crm.basic.domain.CrmAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmAreaMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmAreaMapper {
    long countByExample(CrmAreaExample example);

    int deleteByExample(CrmAreaExample example);

    int insert(CrmArea record);

    int insertSelective(CrmArea record);

    List<CrmArea> selectByExample(CrmAreaExample example);

    int updateByExampleSelective(@Param("record") CrmArea record, @Param("example") CrmAreaExample example);

    int updateByExample(@Param("record") CrmArea record, @Param("example") CrmAreaExample example);
}