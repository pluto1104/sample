package com.ryan.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
	@RequestMapping(value="/hello")
	public String sayHello(){
        return "Test say hello!!";
    }
}
