package com.dbs.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot";
	}
	
	@GetMapping("/rohith")
	public Integer value(int a, int b) {
		int sum = a+b;
		return sum;
	}
	@PostMapping("/sum")
	public Integer soon(@RequestBody int a, int b) {
		return a+b;
	}

}
