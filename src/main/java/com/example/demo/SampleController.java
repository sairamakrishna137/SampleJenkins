package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("/Hello")
	public String SayHello(){
		return "welcome to jenkins";
	}

}
