package com.example.trod_junit;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JunitTestController {
    @GetMapping("/api/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.status(200).body("Hello world");
    }
}
