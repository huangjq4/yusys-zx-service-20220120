package com.zx.service.test.api.controller;

import com.zx.service.domain.user.User;
import com.zx.service.test.core.service.HelloService;
import com.zx.service.test.core.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @Autowired
    private TestService testService;
    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user) {
        // 如果有参数校验失败，会将错误信息封装成对象组装在BindingResult里
       /* for (ObjectError error : bindingResult.getAllErrors()) {
            return error.getDefaultMessage();
        }*/
        return testService.testService(user);
    }

    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello();
    }
}