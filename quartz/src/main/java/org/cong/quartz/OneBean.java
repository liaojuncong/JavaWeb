package org.cong.quartz;

import org.springframework.stereotype.Component;

/**
 * Created by liaojuncong on 05/03/2017.
 */
@Component
public class OneBean {
    public void outMessage(){
        System.out.println("hello 我是第一个任务执行类");
    }
}
