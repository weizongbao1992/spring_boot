package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEureakApplication.class, args);
	}

}
