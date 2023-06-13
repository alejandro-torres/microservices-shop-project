package com.atr.customer.controller;

import com.atr.customer.dto.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
public class CustomerController {


    @GetMapping("/read/{id}")
    public ResponseEntity<CustomerDTO> readCustomerById(@PathVariable Integer id){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/create")
    public ResponseEntity<CustomerDTO> createCustomerById(@RequestBody CustomerDTO customerDTO){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<CustomerDTO> deleteCustomerById(@RequestBody CustomerDTO customerDTO){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
