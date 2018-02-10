package com.spring.kafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.spring.kafka.model.Customer;

@Service
public class KafkaProducer {
	@Autowired
	private KafkaTemplate<String, Customer> kafkaTemplate;
	
	@Value("${jsa.kafka.topic}")
	String kafkaTopic;
	
	public void send(Customer customer) {
	    System.out.println("sending data=" + customer);
	    System.out.println("###### kafkaTopic send ########" + kafkaTopic);
	    kafkaTemplate.send(kafkaTopic, customer);
	}
}
