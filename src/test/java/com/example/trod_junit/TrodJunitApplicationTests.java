package com.example.trod_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.TestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class TrodJunitApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void helloTest() {
		ResponseEntity<String> response = restTemplate.getForEntity("/api/hello", String.class);

		Assertions.assertEquals(200, response.getStatusCode().value());
		Assertions.assertEquals("Hello world", response.getBody());
	}
}
