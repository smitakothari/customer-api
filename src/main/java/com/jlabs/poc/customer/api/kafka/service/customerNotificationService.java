package com.jlabs.poc.customer.api.kafka.service;

import com.jlabs.poc.customer.api.kafka.stream.CustomerNotificationStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class customerNotificationService {

    private CustomerNotificationStream customerNotificationStream;

}
