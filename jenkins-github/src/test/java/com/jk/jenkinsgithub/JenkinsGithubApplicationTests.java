package com.jk.jenkinsgithub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsGithubApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("##### Testing jenkins github integration - modified");
		System.out.println("##### Added one more line");
	}

}
