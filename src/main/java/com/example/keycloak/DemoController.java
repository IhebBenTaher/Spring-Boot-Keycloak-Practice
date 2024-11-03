package com.example.keycloak;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    @GetMapping
    @PreAuthorize("hasRole('student')")
    public String hello(){
        return "hello student";
    }
    @GetMapping("/hello2")
    @PreAuthorize("hasRole('teacher')")
    public String hello2(){
        return "hello teacher";
    }
}
