package Config;



import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Com.app.Controller.EnableSwagger2;
import springfox.documentation.builders.ApiInfoBuilder;
import 

springfox.documentation.service.ApiInfo;
@Configuration
@EnableSwagger2
public class ReimbursementSwaggerConfig<Docket> {

	
	@Bean
	public Docket postsApi(Object DocumentationType) {
		return  new Docket

(DocumentationType.SWAGGER_2)).groupName("Reimbursement - Rest API's").apiInfo(apiInfo()).select()
				.paths(regex

("/reimbursement.*")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Reimbursement Rest Services")
	

			.description("Sample Documentation Generated Using SWAGGER2 for our Reimbursement Rest API")
				

.termsOfServiceUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ")
				.license("Java Swagger docs")
			

	.licenseUrl("saisupriyadevireddy046@gmail.com").version("1.0").build();
	}
	
}

