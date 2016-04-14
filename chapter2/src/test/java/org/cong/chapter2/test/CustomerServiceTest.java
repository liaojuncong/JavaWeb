package org.cong.chapter2.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.cong.chapter2.helper.DatabaseHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.cong.chapter2.model.Customer;
import org.cong.chapter2.service.CustomerService;

/**
 * Created by liaojuncong on 4/4/16.
 */
public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() {
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2, customerList.size());
    }

    @Test
    public void getCustomerTest() throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact", "John");
        fieldMap.put("telephone", "13800138100");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact", "Eric");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        long id = customerList.get(customerList.size() - 1).getId();
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
