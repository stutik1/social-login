package com.stuti.sociallogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/")
    public String home() {
        return "Hello";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello, Secured!";
    }
}
