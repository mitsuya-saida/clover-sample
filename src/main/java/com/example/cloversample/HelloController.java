package com.example.cloversample;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(HelloRequest request) {
        if (StringUtils.isEmpty(request.getName())) {
            return "hello guest";
        }

        return "hello " + request.getName();
    }
}
