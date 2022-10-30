package com.sv.iuh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientGalleryDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientGalleryDemo1Application.class, args);
	}

}

@Configuration
@ComponentScan("com.sv.iuh.eureka")
class RestTemplateConfig {

	// Create a bean for restTemplate to call services
	@Bean
	@LoadBalanced // Load balance between service instances running at different ports.
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}