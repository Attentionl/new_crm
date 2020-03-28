package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminUser;
import com.sxu.crm.basic.domain.AdminUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminUserMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminUserMapper {
    long countByExample(AdminUserExample example);

    int deleteByExample(AdminUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    List<AdminUser> selectByExample(AdminUserExample example);

    AdminUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    int updateByExample(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}