package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminFieldSort;
import com.sxu.crm.basic.domain.AdminFieldSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminFieldSortMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminFieldSortMapper {
    long countByExample(AdminFieldSortExample example);

    int deleteByExample(AdminFieldSortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminFieldSort record);

    int insertSelective(AdminFieldSort record);

    List<AdminFieldSort> selectByExample(AdminFieldSortExample example);

    AdminFieldSort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminFieldSort record, @Param("example") AdminFieldSortExample example);

    int updateByExample(@Param("record") AdminFieldSort record, @Param("example") AdminFieldSortExample example);

    int updateByPrimaryKeySelective(AdminFieldSort record);

    int updateByPrimaryKey(AdminFieldSort record);
}