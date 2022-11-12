package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan( basePackages = {"com.app.entity"})
public class JPAStarter {
		public static void main(String[] args) {
			
		SpringApplication.run(JPAStarter.class,args);
		
		}

}
