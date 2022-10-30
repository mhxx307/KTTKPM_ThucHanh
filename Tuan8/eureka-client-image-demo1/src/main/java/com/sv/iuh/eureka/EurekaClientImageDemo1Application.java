package com.sv.iuh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientImageDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientImageDemo1Application.class, args);
	}

}
