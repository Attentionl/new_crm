package com.sxu.crm.basic.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置扫描dao层mapper所在的位置
 * @author 李今朝
 * @version1.0
 */
@Configuration
@MapperScan("com.sxu.crm.basic.mapper")
public class MybatisConfig {
}
