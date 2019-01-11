package com.zork.metaData.common.aop;

import com.zork.metaData.dataSource.DataSourceContextHolder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAOP {
    @Before("(@annotation(com.zork.metaData.common.annotation.Master) || execution(* com.zork.metaData.service..*.insert*(..)) || " +
            "execution(* com.zork.metaData.service..*.update*(..)) || execution(* com.zork.metaData.service..*.delete*(..)) || " +
            "execution(* com.zork.metaData.service..*.add*(..))) && !@annotation(com.zork.metaData.common.annotation.Slave) -")
    public void setWriteDataSourceType() {
        DataSourceContextHolder.master();
    }

    @Before("(@annotation(com.zork.metaData.common.annotation.Slave) || execution(* com.zork.metaData.service..*.select*(..)) || execution(* com.zork.metaData.service..*.get*(..))) && !@annotation(com.zork.metaData.common.annotation.Master)")
    public void setReadDataSourceType() {
        DataSourceContextHolder.slave();
    }

}
