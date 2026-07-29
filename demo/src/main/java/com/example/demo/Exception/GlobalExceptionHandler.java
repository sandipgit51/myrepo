package com.example.demo.Exception;

import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.*;
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler  {
@ExceptionHandler(UsernofoundExpiton.class)
    public ResponseEntity<Map<String, String>> mesG( UsernofoundExpiton ex) {
    log.info("Inside Custome Excption=========================================");
    Map<String, String> errorResponse = new HashMap<>();
    errorResponse.put("error", ex.getMessage());
                 return  new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
}
}
