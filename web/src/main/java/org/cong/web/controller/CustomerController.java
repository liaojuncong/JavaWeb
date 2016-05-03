package org.cong.web.controller;

import org.cong.web.model.Customer;
import org.cong.web.service.CustomerService;
import org.cong.framework.annotation.Action;
import org.cong.framework.annotation.Controller;
import org.cong.framework.annotation.Inject;
import org.cong.framework.bean.Param;
import org.cong.framework.bean.View;

import java.util.List;

/**
 * Created by liaojuncong on 4/14/16.
 */
@Controller
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @Action("get:/customer")
    public View index() {
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList", customerList);
    }
}
