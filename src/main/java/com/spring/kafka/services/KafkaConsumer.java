package com.spring.kafka.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.spring.kafka.model.Customer;

@Service
public class KafkaConsumer {
	@Value("${jsa.kafka.topic}")
	String kafkaTopic;
	
	
	@KafkaListener(topics="${jsa.kafka.topic}")
    public void processMessage(Customer customer) {
		System.out.println("###### kafkaTopic receive ########" + kafkaTopic);
		System.out.println(" ######### received content = " + customer);
    }
}
