package com.example.demo.control;

import com.example.demo.module.User;
import com.example.demo.service.UserServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("/api")
public class UserControler {

    @Autowired
    UserServies uss;
    @GetMapping("id/{id}")
    public Optional<User> showUser(){
      return    uss.getUser();
      
        
        

    }
    @PostMapping
    public void addUser(){

    }

}
