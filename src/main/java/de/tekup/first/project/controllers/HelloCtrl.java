package de.tekup.first.project.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.first.project.models.User;

@RestController
public class HelloCtrl {
	
	//@RequestMapping(path = "/hello", method = RequestMethod.GET)
	//@GetMapping("/hello")
	@RequestMapping(path = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
	public String sayHello() {
		return "Hello World!!";
	}
	
	@RequestMapping(path = "/hello/{value}")
	public String sayHelloName(@PathVariable("value") String name) {
		return "Hello "+name+"!";
	}
	
	@GetMapping("/create/{name}/{age}")
	public User createUser(@PathVariable("name") String name,@PathVariable("age") int age) {
		return new User(name, age);
	}
	
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}

}
