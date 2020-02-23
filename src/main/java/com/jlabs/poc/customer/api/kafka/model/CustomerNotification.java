package com.jlabs.poc.customer.api.kafka.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class CustomerNotification {
    private long timestamp;
    private String message;
}
