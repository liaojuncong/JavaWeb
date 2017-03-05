package org.cong.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by liaojuncong on 8/21/16.
 */
public class HelloShiro {

    private static final Logger logger = LoggerFactory.getLogger(HelloShiro.class);

    public static void main(String[] args) {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");

        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("shiro", "201314");
        try {
            subject.login(token);
        } catch (AuthenticationException ex) {
            logger.info("登录失败");
            return;
        }

        logger.info("登录成功, Hello " + subject.getPrincipal());

        subject.logout();
    }

}
