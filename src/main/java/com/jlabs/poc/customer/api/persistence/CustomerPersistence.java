package com.jlabs.poc.customer.api.persistence;

import com.jlabs.poc.customer.api.domain.Customer;
import com.jlabs.poc.customer.api.persistence.entity.CustomerEntity;
import com.jlabs.poc.customer.api.persistence.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerPersistence {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerPersistence(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String createCustomer(Customer customer) {

        CustomerEntity customerEntity = CustomerEntity.builder()
                .first_name(customer.getFirstName())
                .last_name(customer.getLastName())
                .city(customer.getCity())
                .description(customer.getDescription())
                .item_id(customer.getItemId())
                .total(customer.getTotal())
                .build();
        CustomerEntity customerResponse = customerRepository.save(customerEntity);
        return String.valueOf(customerResponse.getCustomer_id());
    }

    public List<Customer> findAllCustomer() {
        List<CustomerEntity> customerEntityList = customerRepository.findAll();
        return customerEntityList.stream()
                .map(customerEntity -> customerEntityToCustomer(customerEntity))
                .collect(Collectors.toList());
    }

    private Customer customerEntityToCustomer(CustomerEntity customerEntity) {
        return Customer.builder()
                .id(String.valueOf(customerEntity.getCustomer_id()))
                .firstName(customerEntity.getFirst_name())
                .lastName(customerEntity.getLast_name())
                .city(customerEntity.getCity())
                .itemId(customerEntity.getItem_id())
                .description(customerEntity.getDescription())
                .total(customerEntity.getTotal())
                .build();
    }

    public Customer findCustomerById(String customerId) {
        return null;
    }
}
