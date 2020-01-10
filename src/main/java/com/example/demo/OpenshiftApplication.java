package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class OpenshiftApplication {
	
	@GetMapping("/")
	public String welcome() {
		return "welcome to java";
		
	}
	
	@GetMapping ("/{input}")
	public String congrats(@PathVariable String input) {
		return "hi " + input+ "Yoir application...";
	}
	  
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}

}
