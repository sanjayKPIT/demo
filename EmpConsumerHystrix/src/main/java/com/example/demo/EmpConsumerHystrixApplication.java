package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;
import java.io.IOException;

import com.example.demo.controller.ConsumerController;

@SpringBootApplication

public class EmpConsumerHystrixApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(EmpConsumerHystrixApplication.class, args);
		
		ConsumerController consumerController=ctx.getBean(ConsumerController.class);
		System.out.println(consumerController);
		for(int i=0;i<100;i++)		
		consumerController.getEmployee();
	}
	
	@Bean
	public  ConsumerController  consumerController()
	{
		return  new ConsumerController();
	}


}
