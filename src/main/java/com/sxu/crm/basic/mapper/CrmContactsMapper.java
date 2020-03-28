package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.CrmContacts;
import com.sxu.crm.basic.domain.CrmContactsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className CrmContactsMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface CrmContactsMapper {
    long countByExample(CrmContactsExample example);

    int deleteByExample(CrmContactsExample example);

    int deleteByPrimaryKey(Integer contactsId);

    int insert(CrmContacts record);

    int insertSelective(CrmContacts record);

    List<CrmContacts> selectByExample(CrmContactsExample example);

    CrmContacts selectByPrimaryKey(Integer contactsId);

    int updateByExampleSelective(@Param("record") CrmContacts record, @Param("example") CrmContactsExample example);

    int updateByExample(@Param("record") CrmContacts record, @Param("example") CrmContactsExample example);

    int updateByPrimaryKeySelective(CrmContacts record);

    int updateByPrimaryKey(CrmContacts record);
}