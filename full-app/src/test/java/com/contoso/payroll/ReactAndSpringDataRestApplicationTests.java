package com.contoso.payroll;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReactAndSpringDataRestApplicationTests {

	@Autowired
	private HomeController controller;
	
    @Test
	void contextLoads() {		
	}
    
}
