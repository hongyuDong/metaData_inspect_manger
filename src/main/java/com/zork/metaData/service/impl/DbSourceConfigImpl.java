package com.zork.metaData.service.impl;

import com.zork.metaData.mapper.DbSourceConfigMapper;
import com.zork.metaData.pojo.DbSourceConfig;
import com.zork.metaData.service.DbSourceConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class DbSourceConfigImpl implements DbSourceConfigService {
    @Autowired
    private DbSourceConfigMapper dbSourceConfigMapper;

    @Override
    public List<Map<String, Object>> getDbSourceConfigList(DbSourceConfig dbSourceConfig) {
        List<Map<String, Object>> resultList = dbSourceConfigMapper.getDbSourceConfigList(dbSourceConfig);
        return resultList;
    }

    @Override
    public List<Map<String, Object>> getConnDbSourceConfig(String id) {
        List<Map<String, Object>> resultList = dbSourceConfigMapper.getConnDbSourceConfig(id);
        return resultList;
    }

    @Override
    public List<Map<String, Object>> getConnDbIdSourceConfig(String id) {
        List<Map<String, Object>> resultList = dbSourceConfigMapper.getConnDbIdSourceConfig(id);
        return resultList;
    }

    @Override
    public Integer addDbSourceConfig(DbSourceConfig dbSourceConfig) {
        dbSourceConfig.setCreateDate(new Date());
        return dbSourceConfigMapper.addDbSourceConfig(dbSourceConfig);
    }

    @Override
    public Integer updateDbSourceConfig(DbSourceConfig dbSourceConfig) {
        dbSourceConfig.setUpdateDate(new Date());
        return dbSourceConfigMapper.updateDbSourceConfig(dbSourceConfig);
    }

    @Override
    public Integer batchUpdateStatus() {
        return dbSourceConfigMapper.batchUpdateStatus();
    }

    @Override
    public Integer deleteDbSourceConfig(String id) {
        return dbSourceConfigMapper.deleteDbSourceConfig(id);
    }

    @Override
    public List<Map<String, Object>> getMysqlDate(DbSourceConfig dbSourceConfig) {
        List<Map<String, Object>> resultList = dbSourceConfigMapper.getMysqlDate(dbSourceConfig);
        return resultList;
    }

    @Override
    public List<Map<String, Object>> getOracleDate(DbSourceConfig dbSourceConfig) {
        List<Map<String, Object>> resultList = dbSourceConfigMapper.getOracleDate(dbSourceConfig);
        return resultList;
    }

    @Override
    public List<Map<String, Object>> getSqlserverDate(DbSourceConfig dbSourceConfig) {
        List<Map<String, Object>> resultList = dbSourceConfigMapper.getSqlserverDate(dbSourceConfig);
        return resultList;
    }

    @Override
    public List<Map<String, Object>> getSybaseIQDate(DbSourceConfig dbSourceConfig) {
        List<Map<String, Object>> resultList = dbSourceConfigMapper.getSybaseIQDate(dbSourceConfig);
        return resultList;
    }

    @Override
    public List<Map<String, Object>> getMysqlDataTableSource(DbSourceConfig dbSourceConfig) {
        List<Map<String, Object>> list = dbSourceConfigMapper.getMysqlDataTableSource(dbSourceConfig);
        return list;
    }

    @Override
    public List<Map<String, Object>> getOracleDataTableSource(DbSourceConfig dbSourceConfig) {
        List<Map<String, Object>> list = dbSourceConfigMapper.getOracleDataTableSource(dbSourceConfig);
        return list;
    }

    @Override
    public List<Map<String, Object>> getSqlServerDataTableSource(DbSourceConfig dbSourceConfig) {
        List<Map<String, Object>> list = dbSourceConfigMapper.getSqlServerDataTableSource(dbSourceConfig);
        return list;
    }

    @Override
    public List<Map<String, Object>> getSybaseDataTableSource(DbSourceConfig dbSourceConfig) {
        List<Map<String, Object>> list = dbSourceConfigMapper.getSybaseDataTableSource(dbSourceConfig);
        return list;
    }
}
