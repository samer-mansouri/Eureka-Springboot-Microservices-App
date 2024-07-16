package com.esprit.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;





@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(StrFing[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
