package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.example.demo.controller.ConsumerController;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(Demo1Application.class, args);

		ConsumerController consumerControllerClient = ctx.getBean(ConsumerController.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();

	}

	@Bean
	public ConsumerController consumerControllerClient() {
		return new ConsumerController();
	}

}
