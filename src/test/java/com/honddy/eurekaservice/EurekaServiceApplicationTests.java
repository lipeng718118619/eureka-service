package com.honddy.eurekaservice;

import ch.qos.logback.core.rolling.RollingFileAppender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaServiceApplicationTests {

	@Test
	public void contextLoads() {
		RollingFileAppender pp = new RollingFileAppender();
		//pp.setEncoder();




	}

}
