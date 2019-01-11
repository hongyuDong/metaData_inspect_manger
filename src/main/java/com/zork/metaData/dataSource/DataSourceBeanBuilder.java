package com.zork.metaData.dataSource;

/**
 * Spring数据源构建
 */
public class DataSourceBeanBuilder {
    private static final String MYSQL_URLFORMAT = "jdbc:mysql://%s:%s/%s?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false";
    private static final String ORACLE_URLFORMAT = "jdbc:oracle:thin:@%s:%s/%s";
    private static final String SQLSERVER_URLFORMAT = "jdbc:sqlserver://%s:%s;database=%s;integratedSecurity=false";
    //private static final String SYBASE_URLFORMAT="jdbc:sybase:Tds:%s:%s/%s";
    private static final String SYBASE_URLFORMAT = "jdbc:jtds:sybase://%s:%s/%s";
    private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String SQLSERVER_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String SYBASE_DRIVER = "net.sourceforge.jtds.jdbc.Driver";
    private String databaseURL;
    private String driverClassName;
    private final String beanName;
    private final String databaseIP;
    private final String databasePort;
    private final String databaseName;
    private final String username;
    private final String password;
    private String validationQuery = "select 1";
    private boolean testOnBorrow = true;

    public DataSourceBeanBuilder(String beanName, String databaseIP, String databasePort, String databaseName, String username, String password) {
        this.beanName = beanName;
        this.databaseIP = databaseIP;
        this.databasePort = databasePort;
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;
    }

    public DataSourceBeanBuilder setDatabaseURL(String type) {
        if ("oracle".equals(type)) {
            this.driverClassName = ORACLE_DRIVER;
            this.databaseURL = ORACLE_URLFORMAT;
            this.validationQuery = "select 1 from dual";
        } else if ("mysql".equals(type)) {
            this.driverClassName = MYSQL_DRIVER;
            this.databaseURL = MYSQL_URLFORMAT;
        } else if ("sqlserver".equals(type)) {
            this.driverClassName = SQLSERVER_DRIVER;
            this.databaseURL = SQLSERVER_URLFORMAT;
        } else if ("sybase".equals(type)) {
            this.driverClassName = SYBASE_DRIVER;
            this.databaseURL = SYBASE_URLFORMAT;
            this.validationQuery = "select getdate() from sysobjects where id=1";
        }
        return this;
    }

    public String getDatabaseURL() {
        return databaseURL;
    }

    public DataSourceBeanBuilder validationQuery(String value) {
        this.validationQuery = value;
        return this;
    }

    public DataSourceBeanBuilder testOnBorrow(boolean value) {
        this.testOnBorrow = value;
        return this;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public String getUrl() {
        // jdbc.oracle.tmp.url=jdbc:oracle:thin:@192.168.1.69:1521:xe
        return String.format(this.databaseURL, this.databaseIP, this.databasePort, this.databaseName);
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public String toString() {
        return "DataSourceBeanBuilder{" + "driverClassName='" + driverClassName + '\'' + ", databaseIP='" + databaseIP + '\'' + ", databasePort='" + databasePort + '\'' + ", databaseName='" + databaseName + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + ", validationQuery='" + validationQuery + '\'' + ", testOnBorrow=" + testOnBorrow + '}';
    }
}
