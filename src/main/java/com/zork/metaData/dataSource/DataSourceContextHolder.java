package com.zork.metaData.dataSource;

public class DataSourceContextHolder {

    private static ThreadLocal<DataSourceBeanBuilder> threadLocal = new ThreadLocal<DataSourceBeanBuilder>() {
        @Override
        protected DataSourceBeanBuilder initialValue() {
            return null;
        }
    };

    private static ThreadLocal<String> contextHolder  = new ThreadLocal<String>() {
        @Override
        protected String initialValue() {
            return null;
        }
    };

    static DataSourceBeanBuilder getDataSource() {
        return threadLocal.get();
    }

    static String getJdbcType() {
        return contextHolder.get();
    }

    public static void setDataSource(DataSourceBeanBuilder dataSourceBeanBuilder) {
        clearDataSource();
        threadLocal.set(dataSourceBeanBuilder);
    }

    public static void master(){
        contextHolder.set("writeDataSource");
    }

    public static void slave(){
        contextHolder.set("readDataSource");
        System.out.println("切换到从库");
    }

    public static void clearDataSource() {
        threadLocal.remove();
    }
}
