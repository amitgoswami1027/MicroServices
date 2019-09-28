package com.amitgoswami.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.amitgoswami.microservices.currency-conversion-service")
public class ConversionConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionConversionServiceApplication.class, args);
	}

}
