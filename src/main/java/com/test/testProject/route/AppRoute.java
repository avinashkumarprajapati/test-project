package com.test.testProject.route;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRoute {
    @GetMapping("/returnHello")
    public String returnHello() {
        return "Hello AvinashMe!";
    }
}
