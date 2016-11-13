package com.home.tutorial.test_spring_boot_tomcat.tomcat.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSampleController {
	
	@RequestMapping("/rest")
	public String hello() {
		return "Rest Hello World";
	}

}
