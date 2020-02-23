package com.jlabs.poc.customer.api.kafka.service;

import com.jlabs.poc.customer.api.kafka.model.CustomerNotification;
import com.jlabs.poc.customer.api.kafka.stream.CustomerNotificationStream;
import lombok.extern.slf4j.Slf4j;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Slf4j
@EnableBinding(CustomerNotificationStream.class)
public class CustomerNotificationProducer {

    @Autowired
    private CustomerNotificationStream customerNotificationStream;

//    @Autowired
//    public CustomerNotificationProducer(CustomerNotificationStream customerNotificationStream) {
//        this.customerNotificationStream = customerNotificationStream;
//    }

    public void sendNotification(CustomerNotification customerNotification){
        MessageChannel messageChannel = customerNotificationStream.outboundNotifications();
        messageChannel.send(MessageBuilder
                .withPayload(customerNotification)
//                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}
