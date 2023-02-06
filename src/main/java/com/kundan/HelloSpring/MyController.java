package com.kundan.HelloSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home()
	{
		return "<h2>Hello Kundan, Welcome to CLOUD<h2>";
	}

}
