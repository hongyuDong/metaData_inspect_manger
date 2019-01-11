package com.zork.metaData.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface MasterMapper {
    @Select("select * from slave")
    List<Map<String,Object>>  selMaster();

    @Select("select * from t_permission")
    List<Map<String,Object>>  selPermission();
}
