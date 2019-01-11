package com.zork.metaData.dataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DynamicDataSourceConfig {
    protected static Log log = LogFactory.getLog(DynamicDataSourceConfig.class);

    @Bean(name = "alldataSource")
    public DynamicDataSource dynamicDataSource(@Qualifier("writeDataSource") DataSource writeDataSource,
                                               @Qualifier("readDataSource") DataSource readDataSource) {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map<Object, Object> map = new HashMap<>();
        map.put("writeDataSource", writeDataSource);
        map.put("readDataSource", readDataSource);
        dynamicDataSource.setTargetDataSources(map);
        dynamicDataSource.setDefaultTargetDataSource(writeDataSource);
        return dynamicDataSource;
    }
}
