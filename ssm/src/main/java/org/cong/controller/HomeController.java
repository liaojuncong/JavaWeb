package org.cong.controller;

import com.alibaba.fastjson.JSON;
import org.cong.pojo.Customer;
import org.cong.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by liaojuncong on 4/11/16.
 */
@Controller
public class HomeController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value="/home", method = RequestMethod.GET)
    public String home(HttpServletRequest request, Model model) {
        String idValue = request.getParameter("id");
        int id = 0;
        if(idValue != null)
            id = Integer.parseInt(idValue);
        Customer customer = customerService.getById(id);

        model.addAttribute("customer", customer);
        model.addAttribute("customerJson", JSON.toJSONString(customer));
        return "home";
    }
}
