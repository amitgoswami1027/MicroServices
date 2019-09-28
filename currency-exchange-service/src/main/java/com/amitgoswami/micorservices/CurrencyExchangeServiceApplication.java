package com.amitgoswami.micorservices;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}

	//Added Spring Cloud Sleuth to Zuul Api Gateway Server
	@Bean
	public Sampler defaultSampler(){

		return Sampler.ALWAYS_SAMPLE;
	}
}
