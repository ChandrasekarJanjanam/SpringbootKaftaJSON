package com.spring.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.kafka.model.Customer;
import com.spring.kafka.services.KafkaProducer;


@SpringBootApplication
public class SpringKafkaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}
	
	@Autowired
	KafkaProducer producer;
	
	@Override
	public void run(String... arg0) throws Exception {
		// Send Mary customer
		Customer mary = new Customer("chandra", 32);
		producer.send(mary);
		
		// Send Peter customer
		Customer peter = new Customer("sekar", 23);
		producer.send(peter);
	}
}
