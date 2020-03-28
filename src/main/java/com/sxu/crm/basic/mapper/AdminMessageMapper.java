package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminMessage;
import com.sxu.crm.basic.domain.AdminMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminMessageMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminMessageMapper {
    long countByExample(AdminMessageExample example);

    int deleteByExample(AdminMessageExample example);

    int deleteByPrimaryKey(Long messageId);

    int insert(AdminMessage record);

    int insertSelective(AdminMessage record);

    List<AdminMessage> selectByExample(AdminMessageExample example);

    AdminMessage selectByPrimaryKey(Long messageId);

    int updateByExampleSelective(@Param("record") AdminMessage record, @Param("example") AdminMessageExample example);

    int updateByExample(@Param("record") AdminMessage record, @Param("example") AdminMessageExample example);

    int updateByPrimaryKeySelective(AdminMessage record);

    int updateByPrimaryKey(AdminMessage record);
}