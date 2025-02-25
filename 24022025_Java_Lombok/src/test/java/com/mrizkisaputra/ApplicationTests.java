package com.mrizkisaputra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void test1() {
		Customer customer = new Customer("001", "cs1");
		Assertions.assertEquals("001", customer.getId());
		Assertions.assertEquals("cs1", customer.getName());
	}

}
