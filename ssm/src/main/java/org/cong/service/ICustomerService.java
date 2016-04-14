package org.cong.service;

import org.cong.pojo.Customer;

import java.util.List;

/**
 * Created by liaojuncong on 4/11/16.
 */
public interface ICustomerService {

    public Customer getById(int id);

    public void insertCustomer(List<Customer> customers);
}
