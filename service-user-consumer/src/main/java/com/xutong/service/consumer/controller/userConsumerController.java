package com.xutong.service.consumer.controller;

import com.xutong.service.consumer.api.ConsumerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userConsumerController {

    @Autowired
    private ConsumerUserService userservice;

    @RequestMapping(value = "/consumersayHello",method = RequestMethod.GET)
    public String sayHello(String name){
        return userservice.sayHello(name);
    }
}
