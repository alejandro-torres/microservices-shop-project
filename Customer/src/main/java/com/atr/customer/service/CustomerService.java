package com.atr.customer.service;

import com.atr.customer.dto.CustomerDTO;
import com.atr.customer.entity.Customer;

import java.util.Optional;

public interface CustomerService {

    Optional<Customer> selectCustomerById(Integer id);

    void registerNewCustomer(CustomerDTO customerDTO);

    Optional<Customer> deleteCustomerById(Integer id);

}
