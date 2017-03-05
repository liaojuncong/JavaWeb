package org.cong.web.controller;

import org.cong.framework.bean.Data;
import org.cong.web.model.Customer;
import org.cong.web.service.CustomerService;
import org.cong.framework.annotation.Action;
import org.cong.framework.annotation.Controller;
import org.cong.framework.annotation.Inject;
import org.cong.framework.bean.Param;
import org.cong.framework.bean.View;

import java.util.List;
import java.util.Map;

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


    @Action("get:/customer_create")
    public View create() {
        Customer customer = customerService.getCustomer(0);
        return new View("customer_create.jsp").addModel("customer", customer);
    }

    @Action("post:/customer_createSubmit")
    public Data createSubmit(Param param) {
        return new Data(true);
    }
}
