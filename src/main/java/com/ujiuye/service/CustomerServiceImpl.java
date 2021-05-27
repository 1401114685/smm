package com.ujiuye.service;

import com.ujiuye.mapper.CustomerMapper;
import com.ujiuye.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public boolean login(Customer customer) {
        Customer customer1 = customerMapper.login(customer);
        if (customer1 != null) {
            return true;
        } else {
            return false;
        }
    }
}
