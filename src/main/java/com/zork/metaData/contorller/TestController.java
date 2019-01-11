package com.zork.metaData.contorller;

import com.alibaba.fastjson.JSON;
import com.zork.metaData.common.annotation.Master;
import com.zork.metaData.common.annotation.Slave;
import com.zork.metaData.mapper.MasterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private MasterMapper masterMapper;

    @GetMapping("/read")
    @Master
    public String  readMetaDate(){
        List<Map<String,Object>> list =  masterMapper.selMaster();
        return JSON.toJSONString(list);
    }

    @GetMapping("/write")
    @Slave
    public String  writeMetaDate(){
        List<Map<String,Object>> list =  masterMapper.selPermission();
        return JSON.toJSONString(list);
    }
}
