package com.demo.HelloService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint")
public class HelloController {

	@RequestMapping(value="/hello/{firstName}/{lastName}" , method=RequestMethod.GET)
	public String get(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return "Hello ="+firstName+ " "+lastName;
	}
}