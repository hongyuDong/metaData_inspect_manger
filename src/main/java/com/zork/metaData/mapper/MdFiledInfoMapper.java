package com.zork.metaData.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MdFiledInfoMapper {
    // 查询元数据信息
    List<Map<String, Object>> selMdFiledInfoList(String id);
    //调用存储过程的方法
    void callInsertMdFiledInfo(String id);

    void callInsertDbLinkMdFiledInfo(String id);
    // 保存元数据信息
    void addMdFiledInfo(List<Map<String, Object>> list);
}
