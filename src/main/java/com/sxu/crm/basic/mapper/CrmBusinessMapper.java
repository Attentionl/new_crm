package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmBusiness;
import com.sxu.crm.basic.domain.CrmBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmBusinessMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmBusinessMapper {
    long countByExample(CrmBusinessExample example);

    int deleteByExample(CrmBusinessExample example);

    int deleteByPrimaryKey(Integer businessId);

    int insert(CrmBusiness record);

    int insertSelective(CrmBusiness record);

    List<CrmBusiness> selectByExample(CrmBusinessExample example);

    CrmBusiness selectByPrimaryKey(Integer businessId);

    int updateByExampleSelective(@Param("record") CrmBusiness record, @Param("example") CrmBusinessExample example);

    int updateByExample(@Param("record") CrmBusiness record, @Param("example") CrmBusinessExample example);

    int updateByPrimaryKeySelective(CrmBusiness record);

    int updateByPrimaryKey(CrmBusiness record);
}