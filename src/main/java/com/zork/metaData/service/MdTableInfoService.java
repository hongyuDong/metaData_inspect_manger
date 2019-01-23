package com.zork.metaData.service;

import java.util.List;
import java.util.Map;

/**
 * 采集元数据表格
 */
public interface MdTableInfoService {
    // 查询元数据信息
    List<Map<String, Object>> selMdTableInfoList(String id);
    // 保存元数据信息
    void addMdTableInfo(List<Map<String, Object>> list, String id, String uuid);
}
