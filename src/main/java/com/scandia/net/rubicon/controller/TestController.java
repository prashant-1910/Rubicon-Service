package com.scandia.net.rubicon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping
	public String test() {
		return "Hi There !!!!!";
	}
}
//http://52.66.187.237:9090/rubicon/test
//http://localhost:9090/swagger-ui/index.html#/test-controller/test