package com.plan9better.remotty.services;

import com.plan9better.remotty.repositories.UserRepository;

import org.springframework.stereotype.Service;

import com.plan9better.remotty.models.User;

@Service
public class UserService {
    private final UserRepository userRepository;
    
    public UserService(UserRepository ur){
        this.userRepository = ur;
    }
    public void addUser(String name){
        User user = new User();
        user.setName(name);
        System.out.println("ADDING USER " + name);
        userRepository.save(user);
    }
    
}
