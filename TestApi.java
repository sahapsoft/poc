package com.example.rate.limit;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.bucket4j.Bucket;

@RestController
@RequestMapping("/api")
public class TestApi {

	Bucket bucket;
	
	@PostMapping(value = "/message/public")
    public ResponseEntity<String> publicMsg(@RequestBody String message) {
		String msg="Public Message from Rate Limit " + message;
        return ResponseEntity.ok(msg);	
	
		
    }
	@PostMapping(value = "/message/private")
    public ResponseEntity<String> privateMsg(@RequestBody String message) {
		String msg="Private Message from Rate Limit " + message;
        return ResponseEntity.ok(msg);		
    }
}
