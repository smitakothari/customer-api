package com.jlabs.poc.customer.api.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String city;
    private String itemId;
    private String description;
    private String total;
}
