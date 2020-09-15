package com.mondal.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsProjectApplicationTests {

	@Test
	void contextLoads() {
		
		int sum = 0;
		int num1 = 4, num2 = 6;
		
		sum = num1 + num2;
		
		assertEquals(10, sum);
	}

}
