package com.himanshu.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
 public class HelloController {
    @GetMapping("/hello")
    public String SayHello(){
        return "Hello from App";
    }
    @RequestMapping("/hello")
    public String requestHello(){
        return "Hello from Request Mapping";
    }
}

