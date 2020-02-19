package com.jlabs.poc.customer.api.service;

import com.jlabs.poc.customer.api.domain.Customer;
import com.jlabs.poc.customer.api.persistence.CustomerPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerPersistence customerPersistence;

    @Autowired
    public CustomerService(CustomerPersistence customerPersistence) {
        this.customerPersistence = customerPersistence;
    }

    public String submitCustomer(Customer customer){
        return customerPersistence.createCustomer(customer);
    }

    public List<Customer> findAllCustomer(){
        return customerPersistence.findAllCustomer();
    }

    public Customer findCustomerById(String customerId){
        return customerPersistence.findCustomerById(customerId);
    }
}
