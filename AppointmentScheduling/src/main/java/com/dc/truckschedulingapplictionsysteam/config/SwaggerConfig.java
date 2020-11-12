package com.dc.truckschedulingapplictionsysteam.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("TruckScheduling")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dc.truckschedulingapplictionsysteam.controller"))
                .build()
                .apiInfo(apiInfo());
    }
    private ApiInfo apiInfo(){
        return new ApiInfo("AppointmentScheduling","","1.0","",new Contact("Brijesh","","btiwari@004"),"Apache License","", Arrays.asList());
    }

}
