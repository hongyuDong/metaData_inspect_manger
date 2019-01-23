package com.zork.metaData.service;


import com.zork.metaData.pojo.DbSourceConfig;

import java.util.List;
import java.util.Map;

/**
 * 采集元数据记录保存
 */
public interface MdDbInfoService {
    // 查询元数据信息
    List<Map<String, Object>> selMdDbInfoList(String id);
    // 保存元数据信息
    int addMdDbInfo(DbSourceConfig dbSourceConfig, String uuid);
    // 更新采集状态
    void updMdDbInfo(String dbId, String status);
}
