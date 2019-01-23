package com.zork.metaData.service.impl;

import com.zork.metaData.mapper.MdTableInfoMapper;
import com.zork.metaData.service.MdTableInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class MdTableInfoImpl implements MdTableInfoService {
    @Autowired
    private MdTableInfoMapper  mdTableInfoMapper;

    @Override
    public List<Map<String, Object>> selMdTableInfoList(String id) {
        List<Map<String, Object>> list = mdTableInfoMapper.selMdTableInfoList(id);
        return list;
    }

    @Override
    public void addMdTableInfo(List<Map<String, Object>> list,String id, String uuid) {
        List<Map<String, Object>> list_ad=new ArrayList<Map<String, Object>>();
        list.forEach(item->{
            if(!item.containsKey("tableCmt")){
                item.put("tableCmt",null);

            }
            item.put("batchId", uuid);
            item.put("id",id);
            item.put("createDate",new Date());
            list_ad.add(item);
        });
        mdTableInfoMapper.addMdTableInfo(list_ad);
    }
}
