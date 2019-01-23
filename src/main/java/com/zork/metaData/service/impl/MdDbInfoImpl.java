package com.zork.metaData.service.impl;

import com.zork.metaData.mapper.MdDbInfoMapper;
import com.zork.metaData.pojo.DbSourceConfig;
import com.zork.metaData.pojo.MdDbInfo;
import com.zork.metaData.service.MdDbInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class MdDbInfoImpl implements MdDbInfoService {
    @Autowired
    private MdDbInfoMapper mdDbInfoMapper;

    @Override
    public List<Map<String, Object>> selMdDbInfoList(String id) {
        List<Map<String, Object>> list = mdDbInfoMapper.selMdDbInfoList(id);
        return list;
    }

    @Override
    public int addMdDbInfo(DbSourceConfig dbSourceConfig, String uuid) {
        MdDbInfo mdDbInfo = new MdDbInfo();
        mdDbInfo.setCreateDate(new Date());
        mdDbInfo.setDbVersion(dbSourceConfig.getDbVersion());
        mdDbInfo.setDsId(dbSourceConfig.getId());
        mdDbInfo.setProduct(dbSourceConfig.getDbType());
        mdDbInfoMapper.addMdDbInfo(mdDbInfo);
        return mdDbInfo.getId().intValue();
    }

    @Override
    public void updMdDbInfo(String dbId, String status) {
        MdDbInfo mdDbInfo = new MdDbInfo();
        mdDbInfo.setId(Long.parseLong(dbId));
        mdDbInfo.setStatus(status);
        mdDbInfoMapper.updMdDbInfo(mdDbInfo);
    }
}
