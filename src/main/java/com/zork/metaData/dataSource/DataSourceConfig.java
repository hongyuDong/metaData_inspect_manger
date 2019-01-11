package com.zork.metaData.dataSource;

import com.zork.metaData.common.util.Base64Encoder;
import org.apache.ibatis.io.VFS;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.ResourceTransactionManager;

import javax.sql.DataSource;

@Component
public class DataSourceConfig {
    protected static Log log = LogFactory.getLog(DataSourceConfig.class);

    @Value("${jdbc.data-source.type}")
    private Class<? extends DataSource> dataSourceType;
    @Value("${jdbc.data-source.u}")
    private String username;
    @Value("${jdbc.data-source.p}")
    private String password;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("alldataSource") DataSource datasource, MybatisConfigurationProperties properties) throws Exception {

        log.info("*************************sqlSessionFactory:begin***********************" + properties);

        VFS.addImplClass(SpringBootVFS.class);

        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(datasource);
        sessionFactory.setTypeAliasesPackage(properties.typeAliasesPackage);
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setCallSettersOnNulls(true);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources(properties.mapperLocations));
        sessionFactory.setConfiguration(configuration);
        // sessionFactory
        // .setConfigLocation(new
        // PathMatchingResourcePatternResolver().getResource(properties.configLocation));

        SqlSessionFactory resultSessionFactory = sessionFactory.getObject();

        log.info("*************************sqlSessionFactory:successs:" + resultSessionFactory + "***********************" + properties);

        return resultSessionFactory;

    }

    @Bean(name = "transactionManager")
    public ResourceTransactionManager transactionManager(@Qualifier("alldataSource") DataSource datasource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(datasource);
        return dataSourceTransactionManager;
    }


    /**
     * 写库 数据源配置
     *
     * @return
     */
    @Bean(destroyMethod = "close", name = "writeDataSource")
    @Primary
    @ConfigurationProperties(prefix = "jdbc.data-source")
    public DataSource writeDataSource() {
        log.info("writeDataSource init ...");
        return DataSourceBuilder.create().type(dataSourceType).username(Base64Encoder.decrypt(username)).password(Base64Encoder.decrypt(password)).build();
    }

    /**
     * 读库 数据源配置
     *
     * @return
     */
    @Bean(destroyMethod = "close", name = "readDataSource")
    @Primary
    @ConfigurationProperties(prefix = "jdbc.slave-data-source")
    public DataSource readDataSource() {
        log.info("readDataSource init ...");
        return DataSourceBuilder.create().type(dataSourceType).username(Base64Encoder.decrypt(username)).password(Base64Encoder.decrypt(password)).build();
    }


    @ConfigurationProperties(prefix = "db.data-source")
    @Component
    public static class MybatisConfigurationProperties {
        private String typeAliasesPackage;
        private String mapperLocations;
        private String configLocation;

        public String getConfigLocation() {
            return configLocation;
        }

        public void setConfigLocation(String configLocation) {
            this.configLocation = configLocation;
        }

        public String getTypeAliasesPackage() {
            return typeAliasesPackage;
        }

        public void setTypeAliasesPackage(String typeAliasesPackage) {
            this.typeAliasesPackage = typeAliasesPackage;
        }

        public String getMapperLocations() {
            return mapperLocations;
        }

        public void setMapperLocations(String mapperLocations) {
            this.mapperLocations = mapperLocations;
        }
    }

}
