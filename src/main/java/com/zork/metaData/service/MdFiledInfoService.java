package com.zork.metaData.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 采集元数据字段数据
 */
public interface MdFiledInfoService {
    // 查询元数据信息
    List<Map<String, Object>> selMdFiledInfoList(String id);
    //调用存储过程的方法
    void callInsertMdFiledInfo(String id);

    void callInsertDbLinkMdFiledInfo(String id);
    // 保存元数据信息
    void addMdFiledInfo(@Param("tableList") List<Map<String, Object>> tableList, @Param("list") List<Map<String, Object>> list);
}
