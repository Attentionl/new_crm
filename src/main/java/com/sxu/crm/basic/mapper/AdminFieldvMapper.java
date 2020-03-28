package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminFieldv;
import com.sxu.crm.basic.domain.AdminFieldvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminFieldvMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminFieldvMapper {
    long countByExample(AdminFieldvExample example);

    int deleteByExample(AdminFieldvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminFieldv record);

    int insertSelective(AdminFieldv record);

    List<AdminFieldv> selectByExample(AdminFieldvExample example);

    AdminFieldv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminFieldv record, @Param("example") AdminFieldvExample example);

    int updateByExample(@Param("record") AdminFieldv record, @Param("example") AdminFieldvExample example);

    int updateByPrimaryKeySelective(AdminFieldv record);

    int updateByPrimaryKey(AdminFieldv record);
}