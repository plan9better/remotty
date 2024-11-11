package com.plan9better.remotty.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plan9better.remotty.services.UserService;

@RestController
public class UserController {
    private final UserService us;
    public UserController(UserService userService){
        this.us = userService;
    }
    @PostMapping("/addUser")
    public void AddUser(@RequestParam(value="name") String name){
        us.addUser(name);
    }    
}
