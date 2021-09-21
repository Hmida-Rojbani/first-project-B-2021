package de.tekup.first.project.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {
	
	@RequestMapping(path = "/hello")
	public String sayHello() {
		return "Hello World!!";
	}
	
	@RequestMapping(path = "/hello/{value}")
	public String sayHelloName(@PathVariable("value") String name) {
		return "Hello "+name+"!";
	}

}
