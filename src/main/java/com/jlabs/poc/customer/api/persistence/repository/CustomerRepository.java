package com.jlabs.poc.customer.api.persistence.repository;

import com.jlabs.poc.customer.api.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {
}
