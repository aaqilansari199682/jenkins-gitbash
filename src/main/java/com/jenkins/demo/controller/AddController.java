package com.jenkins.demo.controller;

import com.jenkins.demo.service.AddService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    Logger log= LoggerFactory.getLogger(AddController.class);
    @Autowired
    AddService addService;
    @GetMapping("/add/{a}/{b}")
    public ResponseEntity<String> add(@PathVariable int a,@PathVariable int b){
        log.info("Successfully Get both values");
        return  ResponseEntity.ok("<h1 style='color:red'>sum </h1>of"+a+"and "+b+"is..."+addService.add(a,b));
    }
}
