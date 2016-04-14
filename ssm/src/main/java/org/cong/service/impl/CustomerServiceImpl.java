package org.cong.service.impl;

import org.cong.dao.ICustomerDao;
import org.cong.pojo.Customer;
import org.cong.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liaojuncong on 4/11/16.
 */
@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private ICustomerDao customerDao;

    public Customer getById(int id) {
        return this.customerDao.selectByPrimaryKey(id);
    }
    //@Transactional
    public void insertCustomer(List<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            if (i < 2) {
                this.customerDao.insert(customers.get(i));
            } else {
                throw new RuntimeException();
            }
        }
    }
}
