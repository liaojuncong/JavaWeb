package org.cong.dao;

import org.cong.pojo.Customer;

/**
 * Created by liaojuncong on 4/11/16.
 */
public interface ICustomerDao {

    Customer selectByPrimaryKey(int id);

    int insert(Customer customer);
}
