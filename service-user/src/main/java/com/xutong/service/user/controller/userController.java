package com.xutong.service.user.controller;

import com.xutong.service.api.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController implements UserService {

    @RequestMapping(value = "/sayHello")
    public String sayHello(@RequestParam String name){
        return  "hello,"+name;
    }
}
