package com.zx.service.test.core.service.impl;

import com.zx.service.domain.user.User;
import com.zx.service.test.core.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String testService(User user) {
        return "SUCCESS";
    }
}
