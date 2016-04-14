package org.cong.test;

import com.alibaba.fastjson.JSON;
import org.cong.pojo.Customer;
import org.cong.service.ICustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:conf/spring-mybatis.xml"})

public class TestMyBatis {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(TestMyBatis.class);
    //	private ApplicationContext ac = null;
    @Resource
    private ICustomerService customerService;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void test1() {

        Customer customer = customerService.getById(2);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        LOGGER.info(JSON.toJSONString(customer));
    }
    @Test
    public void test2() {
        List<Customer> customers = new ArrayList<Customer>();
        for(int i=1;i<5;i++){
            Customer customer = new Customer();
            customer.setName("name-"+i);
            customers.add(customer);
        }
        this.customerService.insertCustomer(customers);
    }
}
