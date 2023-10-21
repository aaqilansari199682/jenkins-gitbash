package com.jenkins.demo;

import com.jenkins.demo.service.AddService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsGitbashApplicationTests {
	@Autowired
	AddService addService;

	@Test
	void testAdd() {
		int c=addService.add(2,4);
		assertEquals(6,c);
	}

}
