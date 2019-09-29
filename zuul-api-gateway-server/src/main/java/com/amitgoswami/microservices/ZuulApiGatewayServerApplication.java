package com.amitgoswami.microservices;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

//Execute the request from Zuul API Gateway
// localhost:8765/currency-exchange-service/currency-exchange-service/from/EUR/to/INR
// Port 8765 -> port for zuul API Gateway Server
// API Gateway is used to execute the URLs of there servcies for tracking & Logging etc.
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulApiGatewayServerApplication
{
	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayServerApplication.class, args);
	}

	//Added Spring Cloud Sleuth to Zuul Api Gateway Server
	@Bean
	public Sampler defaultSampler(){

		return Sampler.ALWAYS_SAMPLE;
	}


}
