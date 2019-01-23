package com.zork.metaData.mapper;

import java.util.List;
import java.util.Map;

public interface MdTableInfoMapper {
    // 查询元数据信息
    List<Map<String, Object>> selMdTableInfoList(String id);
    // 保存元数据信息
    void addMdTableInfo(List<Map<String, Object>> list);
}
