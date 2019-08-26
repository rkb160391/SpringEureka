package com.rkb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsSpringEurekaRecommendationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringEurekaRecommendationServiceApplication.class, args);
	}
	 @LoadBalanced
	    @Bean
	    RestTemplate restTemplate() {
	        return new RestTemplate();
	    }

}
