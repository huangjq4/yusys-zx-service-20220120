package com.zx.service.test.core.service.impl;

import com.zx.service.test.core.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello, SpringBoot";
    }
}