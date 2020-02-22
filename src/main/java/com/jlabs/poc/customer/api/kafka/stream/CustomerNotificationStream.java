package com.jlabs.poc.customer.api.kafka.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomerNotificationStream {
    String OUTPUT = "notifications-out";

    @Output(OUTPUT)
    MessageChannel outboundNotifications();
}
