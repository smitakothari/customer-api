package com.jlabs.poc.customer.api.persistence.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_data")
public class CustomerEntity {

    @Id
    @Column
    private int customer_id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String city;
    @Column
    private String item_id;
    @Column
    private String description;
    @Column
    private String total;
}
