package com.ey.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoappApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);
	}
	
	@RequestMapping("/msg1")
	public String getMsg1()
	{
		return "This is message 1";
	}
}
