package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class EmpProducerHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpProducerHystrixApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean servletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet(),
				"/hystrix.stream");
		return registration;
	}

}
