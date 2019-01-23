package com.zork.metaData.mapper;

import com.zork.metaData.pojo.DbSourceConfig;
import com.zork.metaData.pojo.MdDbInfo;

import java.util.List;
import java.util.Map;

/**
 * 采集元数据字段数据
 */
public interface MdDbInfoMapper {
    // 查询元数据信息
    List<Map<String, Object>> selMdDbInfoList(String id);
    // 保存元数据信息
    int addMdDbInfo(MdDbInfo mdDbInfo);
    // 更新采集状态
    void updMdDbInfo(MdDbInfo mdDbInfo);
}
