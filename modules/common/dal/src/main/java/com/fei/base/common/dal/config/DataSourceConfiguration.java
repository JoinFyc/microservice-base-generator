package com.fei.base.common.dal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.fei.base.common.dal.mapper", sqlSessionTemplateRef = "sqlSessionTemplate")
public class DataSourceConfiguration {
}
