package com.xutong.service.consumer.api;

import com.xutong.service.api.user.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserService {
    @Override
    public String sayHello(String name) {
        return "error";
    }
}
