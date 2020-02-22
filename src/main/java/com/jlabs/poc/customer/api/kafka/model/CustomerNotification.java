package com.jlabs.poc.customer.api.kafka.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
public class CustomerNotification {
    private long timestamp;
    private String message;
}
