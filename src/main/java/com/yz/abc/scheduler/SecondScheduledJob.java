package com.yz.abc.scheduler;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * @author your.name Date: 2018-11-15 Time: 15:43
 * @version $Id$
 */

public class SecondScheduledJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("I'm a secondScheduledJob");
    }
}
