package com.jlabs.poc.customer.api.controller;

import com.jlabs.poc.customer.api.domain.Customer;
import com.jlabs.poc.customer.api.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    @ResponseStatus
    public ResponseEntity<String> submitCustomer(){
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAllCustomers(){
        return null;
    }

    @GetMapping(value = "/{customerId}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable("customerId") String customerId){
        return null;
    }
}
