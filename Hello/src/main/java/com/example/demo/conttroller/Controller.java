package com.example.demo.conttroller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	public String getMsg()
	{
		return "Hello Shubham";
	}
}
