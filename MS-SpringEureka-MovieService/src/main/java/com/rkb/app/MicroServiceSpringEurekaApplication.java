package com.rkb.app;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;


@SpringBootApplication
@EnableEurekaClient
public class MicroServiceSpringEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceSpringEurekaApplication.class, args);
	}

}

