package com.kmbl.mw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("cloud")
@EnableDiscoveryClient
@Configuration
@EnableAutoConfiguration
public class MwneftrtgsftApplication {


	public static void main(String[] args) {
		SpringApplication.run(MwneftrtgsftApplication.class, args);
	}

	  /*@Bean
	    public DiscoveryClientRouteDefinitionLocator 
	      discoveryClientRouteLocator(DiscoveryClient discoveryClient) {
	  
	        return new DiscoveryClientRouteDefinitionLocator(discoveryClient, null);
	    }
	*/
}
