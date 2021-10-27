package com.wsousa.demoRestAssured.config;



import io.swagger.v3.oas.models.Components;

import io.swagger.v3.oas.models.OpenAPI;

import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI customOpenAPI() {

		return new OpenAPI()
			.components(new Components())
			.info(new Info().title("RestAssured Application API").description(
				"This is a Spring Boot RESTful service using springdoc-openapi and OpenAPI 3."));

	}

}