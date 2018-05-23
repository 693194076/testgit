package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vo.User;
import com.google.gson.Gson;

@RestController
public class TestController {
	
    @GetMapping("/greeting")
    User home() {
    	User u = new User();
    	Gson gson = new Gson();
        return u;
    }
}
