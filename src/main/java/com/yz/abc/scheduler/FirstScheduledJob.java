package com.yz.abc.scheduler;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * @author your.name Date: 2018-11-15 Time: 15:20
 * @version $Id$
 */

public class FirstScheduledJob extends QuartzJobBean {

    @Autowired
    private AnotherBean anotherBean;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("I'm a FirstScheduledJob");
        this.anotherBean.printMessage();
    }


}
