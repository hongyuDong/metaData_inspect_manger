package com.zork.metaData.quartz;

import com.zork.metaData.quartz.job.ButtonTimerJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

@Configuration
public class StartJob implements ApplicationListener<ContextRefreshedEvent> {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void run(){
        logger.info(">> 启动定时任务...");
        QuartzManager.startJobs();
      /*  QuartzManager.addJob(
                "SpecialPeriodJob",
                "SpecialPeriodJobGroup",
                "SpecialPeriodTrigger",
                "SpecialPeriodTriggerGroup",
                ButtonTimerJob.class,
                "0/30 * * * * ?");*/
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("启动定时任务......");
        run();
    }
}
