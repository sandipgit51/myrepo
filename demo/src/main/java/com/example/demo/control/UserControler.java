package com.example.demo.control;

import com.example.demo.module.User;
import com.example.demo.service.UserServies;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserControler {

    @Autowired
    UserServies uss;


    @GetMapping("/id/{id}")
    public User showUser(@PathVariable Integer id){
        log.debug("inside controler------------------------------------------");
        return uss.getUser(id);
   }
    @PostMapping
    public void addUser(){

    }

}
