package com.zork.metaData.dataSource;


/**
 * Spring数据源Bean
 */
final class DataSourceBean {
    private final String beanName;
    private final String driverClassName;
    private final String url;
    private final String username;
    private final String password;
    private final String connectionTestQuery;
    private final String maximumPoolSize;
    private final String idleTimeout;
    private final String connectionTimeout;
    private final boolean testOnBorrow;

    public DataSourceBean(DataSourceBeanBuilder beanBuilder) {
        this.beanName = beanBuilder.getBeanName();
        this.driverClassName = beanBuilder.getDriverClassName();
        this.url = beanBuilder.getUrl();
        this.password = beanBuilder.getPassword();
        this.testOnBorrow = beanBuilder.isTestOnBorrow();
        this.username = beanBuilder.getUsername();
        this.connectionTestQuery = beanBuilder.getValidationQuery();
        this.maximumPoolSize = "20";
        this.idleTimeout = "30000";
        this.connectionTimeout="30000";
    }

    public String getBeanName() {
        return beanName;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getValidationQuery() {
        return connectionTestQuery;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }


    @Override
    public String toString() {
        return "DataSourceBean{" + "driverClassName='" + driverClassName + '\'' + ", url='" + url + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + ", validationQuery='" + connectionTestQuery + '\'' + ", testOnBorrow=" + testOnBorrow + '}';
    }
}
