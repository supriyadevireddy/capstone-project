package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class MailSwagger {
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Email - Rest API's").apiInfo(apiInfo()).select()
				.paths(regex("/email.*")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Email Rest Services")
				.description("Sample Documentation Generated Using SWAGGER2 for our Email Rest API")
				.termsOfServiceUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ")
				.license("Java Swagger docs")
				.licenseUrl("saiaupriyadevireddy046@@gmail.com").version("1.0").build();
	}

}

