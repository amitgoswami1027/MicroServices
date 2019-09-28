package com.amitgoswami.microservices;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients("com.amitgoswami.microservices")
@EnableDiscoveryClient
public class ConversionConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionConversionServiceApplication.class, args);
	}

	//Added Spring Cloud Sleuth to Zuul Api Gateway Server
	@Bean
	public Sampler defaultSampler(){

		return Sampler.ALWAYS_SAMPLE;
	}
}
