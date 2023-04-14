package com.example.demo;

@RestController
public class HelloSpring {
	
	@GetMapping(path = "/")
	public String Hello()
	{
		return "<h2>Hello world!!! <h2>";            //we can also write return "<h2>hello world</h2>"
	}

}

