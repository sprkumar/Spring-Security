package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Ravindra
 *
 */
@RestController
public class SpringSecurityController {
	@GetMapping("/")
	public String home() {
		return "<h2>Welcome everyone can access!</h2>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h2>Welcome User</h2>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h2>Welcome Admin</h2>";
	}
}
