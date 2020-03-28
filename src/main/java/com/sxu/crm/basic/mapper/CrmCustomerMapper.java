package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmCustomer;
import com.sxu.crm.basic.domain.CrmCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmCustomerMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmCustomerMapper {
    long countByExample(CrmCustomerExample example);

    int deleteByExample(CrmCustomerExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(CrmCustomer record);

    int insertSelective(CrmCustomer record);

    List<CrmCustomer> selectByExample(CrmCustomerExample example);

    CrmCustomer selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") CrmCustomer record, @Param("example") CrmCustomerExample example);

    int updateByExample(@Param("record") CrmCustomer record, @Param("example") CrmCustomerExample example);

    int updateByPrimaryKeySelective(CrmCustomer record);

    int updateByPrimaryKey(CrmCustomer record);
}