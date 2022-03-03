package com.example.securingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SayController {

    @GetMapping("/say")
    public String say() {
        return "say";
    }

    @GetMapping("/prime")
    public String prime() {
        for (int i = 2; i < 50000000; i++) {
            isPrime(i);
        }
        return "prime";
    }

    private boolean isPrime(int number) {
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
