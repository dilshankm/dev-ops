package com.dilshan.devops.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/devops")
public class DevOpsController {

    @GetMapping
    public ResponseEntity<Object> returnStatuc(){
        return new ResponseEntity<Object>("OK", HttpStatus.OK);
    }
}
