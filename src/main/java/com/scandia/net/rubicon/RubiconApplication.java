package com.scandia.net.rubicon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RubiconApplication {

	//	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	//	runtimeOnly 'org.postgresql:postgresql'
	//	testImplementation 'org.springframework.boot:spring-boot-starter-data-jpa-test'
	//providedRuntime 'org.springframework.boot:spring-boot-starter-tomcat-runtime'

	public static void main(String[] args) {
		SpringApplication.run(RubiconApplication.class, args);
	}

}
