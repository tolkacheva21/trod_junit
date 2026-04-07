package com.example.trod_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class TrodJunitApplicationTests {
	private final JunitTestController controller = new JunitTestController();

	@Test
	void helloTest() {
		ResponseEntity<String> response = controller.hello();

		Assertions.assertNotNull(response);
		Assertions.assertEquals(200, response.getStatusCode().value());
		Assertions.assertEquals("Hello world", response.getBody());
	}
}
