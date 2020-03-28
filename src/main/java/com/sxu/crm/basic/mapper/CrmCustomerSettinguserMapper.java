package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmCustomerSettinguser;
import com.sxu.crm.basic.domain.CrmCustomerSettinguserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmCustomerSettinguserMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmCustomerSettinguserMapper {
    long countByExample(CrmCustomerSettinguserExample example);

    int deleteByExample(CrmCustomerSettinguserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmCustomerSettinguser record);

    int insertSelective(CrmCustomerSettinguser record);

    List<CrmCustomerSettinguser> selectByExample(CrmCustomerSettinguserExample example);

    CrmCustomerSettinguser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmCustomerSettinguser record, @Param("example") CrmCustomerSettinguserExample example);

    int updateByExample(@Param("record") CrmCustomerSettinguser record, @Param("example") CrmCustomerSettinguserExample example);

    int updateByPrimaryKeySelective(CrmCustomerSettinguser record);

    int updateByPrimaryKey(CrmCustomerSettinguser record);
}