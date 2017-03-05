package org.cong.quartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liaojuncong on 05/03/2017.
 */
public class QuartzTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("quartz-context.xml");
    }
}
