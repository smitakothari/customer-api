package com.jlabs.poc.customer.api.kafka.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(CustomerNotificationStream.class)
public class StreamsConfig {
}
