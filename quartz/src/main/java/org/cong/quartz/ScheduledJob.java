package org.cong.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by liaojuncong on 05/03/2017.
 */
public class ScheduledJob extends QuartzJobBean {

    private TowBean towBean;

    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        towBean.outMessage();
    }

    public void setTowBean(TowBean towBean) {
        this.towBean = towBean;
    }
}
