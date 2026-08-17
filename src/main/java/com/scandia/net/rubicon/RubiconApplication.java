package com.scandia.net.rubicon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RubiconApplication extends SpringBootServletInitializer {

	//	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	//	runtimeOnly 'org.postgresql:postgresql'
	//	testImplementation 'org.springframework.boot:spring-boot-starter-data-jpa-test'
	//providedRuntime 'org.springframework.boot:spring-boot-starter-tomcat-runtime'

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RubiconApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RubiconApplication.class, args);
	}

}
