package com.mertkadakal.springdeneme.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.mertkadakal.springdeneme"})
@SpringBootApplication
public class SpringdenemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdenemeApplication.class, args);
	}

}
