package com.example.demo.service;

import com.example.demo.module.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServies {
    @Bean
    public Optional<User> getUser(){
       return Optional.of(new User(1, "sandip", "sandip@sabat"));
    }


}
