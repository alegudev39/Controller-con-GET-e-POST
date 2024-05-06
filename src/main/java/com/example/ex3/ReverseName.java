package com.example.ex3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ex3")
public class ReverseName {

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/reverseName")
    public String getReversedName(@RequestParam String name) {
        return reverseString(name);
    }


}