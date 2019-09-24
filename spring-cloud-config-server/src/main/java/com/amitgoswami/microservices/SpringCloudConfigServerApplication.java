package com.amitgoswami.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// This service helps to have the centralized store of all the services properties
//http://localhost:8888/limits-service/default
//http://localhost:8888/limits-service/dev
//http://localhost:8888/limits-service/qa

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}

}
