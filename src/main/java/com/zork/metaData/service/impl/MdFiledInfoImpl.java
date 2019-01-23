package com.zork.metaData.service.impl;

import com.zork.metaData.mapper.MdFiledInfoMapper;
import com.zork.metaData.service.MdFiledInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class MdFiledInfoImpl implements MdFiledInfoService {
    @Autowired
    private MdFiledInfoMapper mdFiledInfoMapper;

    @Override
    public List<Map<String, Object>> selMdFiledInfoList(String id) {
        List<Map<String, Object>> list = mdFiledInfoMapper.selMdFiledInfoList(id);
        return list;
    }

    @Override
    public void callInsertMdFiledInfo(String id) {
        mdFiledInfoMapper.callInsertMdFiledInfo(id);
    }

    @Override
    public void callInsertDbLinkMdFiledInfo(String id) {
        mdFiledInfoMapper.callInsertDbLinkMdFiledInfo(id);
    }

    @Override
    public void addMdFiledInfo(List<Map<String, Object>> tableList,List<Map<String, Object>> list) {
        List<Map<String, Object>> list_ad=new ArrayList<Map<String, Object>>();
        list.forEach(item->{
            tableList.forEach(tableItem->{
                if(String.valueOf(item.get("tableName")).trim().toLowerCase().equals(String.valueOf(tableItem.get("tableName")).trim().toLowerCase())){
                    item.put("id",tableItem.get("id"));
                    item.put("batchId",tableItem.get("batchId"));
                }
            });
            if(!item.containsKey("dataLength")){
                item.put("dataLength",null);
            }
            if(!item.containsKey("dataScale")){
                item.put("dataScale",null);
            }if(!item.containsKey("fieldCmt")){
                item.put("fieldCmt",null);
            }if(!item.containsKey("tableComment")){
                item.put("tableComment",null);
            }
            item.put("createDate",new Date());

            list_ad.add(item);
        });
        int batchCount = 50;//每批commit的个数
        int batchLastIndex = batchCount - 1;//每批最后一个的下标
        for (int index = 0, len = list_ad.size(); index < len - 1; ) {
            if (batchLastIndex > len - 1) {
                batchLastIndex = len - 1;
                mdFiledInfoMapper.addMdFiledInfo(list_ad.subList(index, batchLastIndex + 1));
                System.out.println("index:" + index + "     batchLastIndex:" + batchLastIndex);
                break;//数据插入完毕,退出循环
            } else {
                mdFiledInfoMapper.addMdFiledInfo(list_ad.subList(index, batchLastIndex + 1));
                System.out.println("index:" + index + "     batchLastIndex:" + batchLastIndex);
                index = batchLastIndex + 1;//设置下一批下标
                batchLastIndex = index + (batchCount - 1);
            }
        }
    }
}
