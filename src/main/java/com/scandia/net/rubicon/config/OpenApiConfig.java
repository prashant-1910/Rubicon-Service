package com.scandia.net.rubicon.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI rubiconOpenAPI() {
		Server server = new Server();
		server.setUrl("/api/rubicon");
		server.setDescription("API Server");

		return new OpenAPI()
				.servers(List.of(server))
				.info(new Info()
						.title("Rubicon API")
						.description("Rubicon application API documentation")
						.version("v0.0.1"));
	}
}
