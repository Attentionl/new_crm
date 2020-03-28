package com.sxu.crm.basic.mapper;

import com.sxu.crm.basic.domain.AdminFile;
import com.sxu.crm.basic.domain.AdminFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李今朝
 * @className AdminFileMapper
 * @version1.0
 * @description
 * @createdTime 2020/3/24 22:53
 */
public interface AdminFileMapper {
    long countByExample(AdminFileExample example);

    int deleteByExample(AdminFileExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(AdminFile record);

    int insertSelective(AdminFile record);

    List<AdminFile> selectByExample(AdminFileExample example);

    AdminFile selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") AdminFile record, @Param("example") AdminFileExample example);

    int updateByExample(@Param("record") AdminFile record, @Param("example") AdminFileExample example);

    int updateByPrimaryKeySelective(AdminFile record);

    int updateByPrimaryKey(AdminFile record);
}