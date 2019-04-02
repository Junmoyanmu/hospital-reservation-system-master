package com.hms.application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * @Description ToDo
 * @Author Ly
 * @Date 2019/3/27 13:52
 * 开启事务支持
 **/
@Configuration
@EnableTransactionManagement
public class TransactionConfiguration implements TransactionManagementConfigurer {

    @Autowired
    DataSource dataSource;

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
