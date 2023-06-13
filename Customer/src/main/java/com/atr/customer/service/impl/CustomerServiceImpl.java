package com.atr.customer.service.impl;

import com.atr.customer.dto.CustomerDTO;
import com.atr.customer.entity.Customer;
import com.atr.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void registerNewCustomer(CustomerDTO customerDTO) {

    }

    @Override
    public Optional<Customer> deleteCustomerById(Integer id) {
        return Optional.empty();
    }
}
