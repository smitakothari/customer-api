//package com.jlabs.poc.customer.api.mapper;
//
//import com.jlabs.poc.customer.api.domain.Customer;
//import com.jlabs.poc.customer.api.persistence.entity.CustomerEntity;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//@Mapper(componentModel = "spring")
//public interface CustomerEntityMapper {
//    @Mapping(target = "id", source = "customer.id")
//    @Mapping(target = "first_name", source = "customer.firstName")
//    @Mapping(target = "last_name", source = "customer.lastName")
//    @Mapping(target = "city", source = "customer.city")
//    @Mapping(target = "item_id", source = "customer.itemId")
//    @Mapping(target = "description", source = "customer.description")
//    @Mapping(target = "total", source = "customer.total")
//    CustomerEntity customerToCustomerEntityMapper(Customer customer);
//}
//
//
