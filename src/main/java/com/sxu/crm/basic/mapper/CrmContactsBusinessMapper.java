package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmContactsBusiness;
import com.sxu.crm.basic.domain.CrmContactsBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmContactsBusinessMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmContactsBusinessMapper {
    long countByExample(CrmContactsBusinessExample example);

    int deleteByExample(CrmContactsBusinessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmContactsBusiness record);

    int insertSelective(CrmContactsBusiness record);

    List<CrmContactsBusiness> selectByExample(CrmContactsBusinessExample example);

    CrmContactsBusiness selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmContactsBusiness record, @Param("example") CrmContactsBusinessExample example);

    int updateByExample(@Param("record") CrmContactsBusiness record, @Param("example") CrmContactsBusinessExample example);

    int updateByPrimaryKeySelective(CrmContactsBusiness record);

    int updateByPrimaryKey(CrmContactsBusiness record);
}