package com.zork.metaData.dataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(DataSourceConfig.class)
@MapperScan(basePackages = {"com.zork.metaData.service.impl","com.zork.metaData.mapper"}, sqlSessionFactoryRef = "sqlSessionFactory")
public class DataSourceScanConfiguration {
    protected static Log log = LogFactory.getLog(DataSourceScanConfiguration.class);

    public DataSourceScanConfiguration() {
        log.info("*************************DataSourceScanConfiguration***********************");
    }
}
