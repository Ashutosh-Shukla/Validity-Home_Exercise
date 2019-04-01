package com.validity.duplicates.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	

}
