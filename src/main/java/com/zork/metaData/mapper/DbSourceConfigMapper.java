package com.zork.metaData.mapper;


import com.zork.metaData.pojo.DbSourceConfig;

import java.util.List;
import java.util.Map;

public interface DbSourceConfigMapper {
    // 查询数据源列表信息
    List<Map<String, Object>> getDbSourceConfigList(DbSourceConfig dbSourceConfig);
    // 获取数据源配置信息 dsid
    List<Map<String, Object>> getConnDbSourceConfig(String id);
    // 获取数据源配置信息 id
    List<Map<String, Object>> getConnDbIdSourceConfig(String id);
    // 新增数据源
    Integer addDbSourceConfig(DbSourceConfig dbSourceConfig);
    // 修改数据源
    Integer updateDbSourceConfig(DbSourceConfig dbSourceConfig);
    // 批量更新数据源状态
    Integer batchUpdateStatus();
    // 删除数据源
    Integer deleteDbSourceConfig(String id);
    // 获取Mysql元数据
    List<Map<String, Object>> getMysqlDate(DbSourceConfig dbSourceConfig);
    // 获取Oracle元数据
    List<Map<String, Object>> getOracleDate(DbSourceConfig dbSourceConfig);
    // 获取Sqlserver元数据
    List<Map<String, Object>> getSqlserverDate(DbSourceConfig dbSourceConfig);
    // 获取SybaseIQ元数据
    List<Map<String, Object>> getSybaseIQDate(DbSourceConfig dbSourceConfig);
    // 获取Mysql表结构
    List<Map<String, Object>> getMysqlDataTableSource(DbSourceConfig dbSourceConfig);
    // 获取Oracle表结构
    List<Map<String, Object>> getOracleDataTableSource(DbSourceConfig dbSourceConfig);
    // 获取Sqlserver表结构
    List<Map<String, Object>> getSqlServerDataTableSource(DbSourceConfig dbSourceConfig);
    // 获取SybaseIQ表结构
    List<Map<String, Object>> getSybaseDataTableSource(DbSourceConfig dbSourceConfig);
}
