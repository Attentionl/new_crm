package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmCustomerSetting;
import com.sxu.crm.basic.domain.CrmCustomerSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmCustomerSettingMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmCustomerSettingMapper {
    long countByExample(CrmCustomerSettingExample example);

    int deleteByExample(CrmCustomerSettingExample example);

    int deleteByPrimaryKey(Integer settingId);

    int insert(CrmCustomerSetting record);

    int insertSelective(CrmCustomerSetting record);

    List<CrmCustomerSetting> selectByExample(CrmCustomerSettingExample example);

    CrmCustomerSetting selectByPrimaryKey(Integer settingId);

    int updateByExampleSelective(@Param("record") CrmCustomerSetting record, @Param("example") CrmCustomerSettingExample example);

    int updateByExample(@Param("record") CrmCustomerSetting record, @Param("example") CrmCustomerSettingExample example);

    int updateByPrimaryKeySelective(CrmCustomerSetting record);

    int updateByPrimaryKey(CrmCustomerSetting record);
}