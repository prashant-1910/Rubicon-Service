package com.scandia.net.rubicon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RubiconApplication {

	public static void main(String[] args) {
		SpringApplication.run(RubiconApplication.class, args);
		System.out.println("Lets Start");

		//	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
		//	runtimeOnly 'org.postgresql:postgresql'
		//	testImplementation 'org.springframework.boot:spring-boot-starter-data-jpa-test'

	}

}
