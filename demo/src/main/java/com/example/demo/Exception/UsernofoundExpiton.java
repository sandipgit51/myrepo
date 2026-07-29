package com.example.demo.Exception;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.context.annotation.Bean;

public class UsernofoundExpiton extends RuntimeException {
public  UsernofoundExpiton(Integer id){
    super("User with id " + id + " not found");
    }
}
