package com.example.securingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SayController {

    @GetMapping("/say")
    public String say() {
        return "say";
    }
}
