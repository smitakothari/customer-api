package com.jlabs.poc.customer.api.service;

import com.jlabs.poc.customer.api.domain.Customer;
import com.jlabs.poc.customer.api.kafka.model.CustomerNotification;
import com.jlabs.poc.customer.api.kafka.service.CustomerNotificationProducer;
import com.jlabs.poc.customer.api.persistence.CustomerPersistence;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerPersistence customerPersistence;
    private CustomerNotificationProducer customerNotificationService;

    @Autowired
    public CustomerService(CustomerPersistence customerPersistence, CustomerNotificationProducer customerNotificationService) {
        this.customerPersistence = customerPersistence;
        this.customerNotificationService = customerNotificationService;
    }

    public String submitCustomer(Customer customer){
        String customerId = customerPersistence.createCustomer(customer);
        if(!StringUtils.isNullOrEmpty(customerId)){
            CustomerNotification customerNotification = new CustomerNotification();
            customerNotification.setMessage("Customer successfully added");
            customerNotificationService.sendNotification(customerNotification);
        }
        return customerId;
    }

    public List<Customer> findAllCustomer(){
        return customerPersistence.findAllCustomer();
    }

    public Customer findCustomerById(String customerId){
        return customerPersistence.findCustomerById(customerId);
    }
}
