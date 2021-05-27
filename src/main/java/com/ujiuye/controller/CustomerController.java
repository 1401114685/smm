package com.ujiuye.controller;

import com.ujiuye.pojo.Customer;
import com.ujiuye.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("login")
    public String login(Customer customer){
    boolean flag=customerService.login(customer);
    if (flag){
        System.out.println("dengluchenggong");
        return "main";
    }else{
        System.out.println("aaaaa");
        return"redirect:login.jsp";
    }
}

}
