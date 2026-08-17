package com.scandia.net.rubicon.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI rubiconOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Rubicon API")
						.description("Rubicon application API documentation")
						.version("v0.0.1"));
	}
}
