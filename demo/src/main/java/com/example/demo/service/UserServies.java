package com.example.demo.service;

import com.example.demo.Exception.UsernofoundExpiton;
import com.example.demo.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Optional;

@Service
public class UserServies {
    private static Map<Integer, User> userMap = new HashMap<>();
    @Autowired
    User ui;
    static {
        userMap.put(1, new User(1, "Alice", "alice@example.com"));
        userMap.put(2, new User(2, "Bob", "bob@example.com"));
    }

    public User getUser(Integer id)  {
       if(id==1 || id==2){
        return userMap.get(id);
       }
       else{
           throw new UsernofoundExpiton(id);

        }

}


}
