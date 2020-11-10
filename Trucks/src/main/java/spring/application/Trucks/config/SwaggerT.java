package spring.application.Trucks.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerT {
	  @Bean
	    public Docket api(){
	        return new Docket(DocumentationType.SWAGGER_2)
	                .groupName("Trucks-App")
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("spring.application.Trucks.AppController"))
	                .build()
	                .apiInfo(apiInfo());

	    }

	    private ApiInfo apiInfo(){
	        return new ApiInfo("Trucks-App","","1.0","",new Contact("Brijesh","","btiwari004@gmail.com"),"Apache License","", Arrays.asList());
	    }
}
