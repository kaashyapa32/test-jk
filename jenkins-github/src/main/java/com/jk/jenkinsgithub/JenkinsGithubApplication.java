package com.jk.jenkinsgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsGithubApplication {

	public static void main(String[] args) {
		System.out.println("Testing jenkins github integration");
		SpringApplication.run(JenkinsGithubApplication.class, args);
	}
}
