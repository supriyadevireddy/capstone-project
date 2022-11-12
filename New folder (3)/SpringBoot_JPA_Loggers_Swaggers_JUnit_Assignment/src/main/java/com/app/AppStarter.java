package com.app;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppStarter {

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(AppStarter.class);
			log.debug("Appstarter application started ....");
			SpringApplication.run(AppStarter.class,  args);

	}

}
