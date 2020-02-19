package com.jlabs.poc.customer.api.controller;

import com.jlabs.poc.customer.api.domain.Customer;
import com.jlabs.poc.customer.api.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus
    public ResponseEntity<String> submitCustomer(@RequestBody Customer customer){
        try{
            String customerId = customerService.submitCustomer(customer);
            return new ResponseEntity<String>(customerId, null, HttpStatus.OK);
        } catch (Exception e){
            throw e;
        }
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAllCustomers(){
        try {
            List<Customer> customers = customerService.findAllCustomer();
            return new ResponseEntity<>(customers, null, HttpStatus.OK);
        } catch (Exception e){
            throw e;
        }
    }

    @GetMapping(value = "/{customerId}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable("customerId") String customerId){
        try{
            Customer customer = customerService.findCustomerById(customerId);
            return new ResponseEntity<>(customer, null, HttpStatus.OK);
        } catch (Exception e){
            throw e;
        }
    }
}
