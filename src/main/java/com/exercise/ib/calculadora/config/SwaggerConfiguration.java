package com.exercise.ib.calculadora.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author imadb
 * @version 1.0.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    /**
     * Api docket.
     *
     * @return the docket
     */
    @Bean
    public static Docket api() {

        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.exercise.ib.calculadora"))
                .paths(PathSelectors.regex("/.*"))
                .build();
    }



}