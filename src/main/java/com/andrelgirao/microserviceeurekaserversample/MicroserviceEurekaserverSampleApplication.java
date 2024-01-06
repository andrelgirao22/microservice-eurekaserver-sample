package com.andrelgirao.microserviceeurekaserversample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEurekaserverSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEurekaserverSampleApplication.class, args);
	}

}
