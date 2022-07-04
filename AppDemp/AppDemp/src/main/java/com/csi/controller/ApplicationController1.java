package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController1 {
	
	@GetMapping("/service")
	public String getService() {
		
		return "Mobile service Application";
		
	}
	
	@GetMapping("/Address")
	public String getAddress() {
		
		return "Welcome in Pune";
		
	}
	
	@GetMapping("/Address1")
	public String getAddress1() {
		
		return "Welcome in Pune";
		
	}
	@GetMapping("/Address2")
	public String getAddress2() {
		
		return "Welcome in Pune";
		
	}
	
	

}
