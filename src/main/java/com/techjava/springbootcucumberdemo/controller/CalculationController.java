package com.techjava.springbootcucumberdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
public class CalculationController {

    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2) {
        return  "Addition of " + num1 + " + " + num2 + " is " +   (num1 + num2);
    }

    @GetMapping("/sub/{num1}/{num2}")
    public String subtract(@PathVariable int num1, @PathVariable int num2) {
        return  "Subtraction of " + num1 + " - " + num2 + " is " +   (num1 - num2);
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public String multiple(@PathVariable int num1, @PathVariable int num2) {
        return  "Multiple of " + num1 + " * " + num2 + " is " +   (num1 * num2);
    }

    @GetMapping("/divide/{num1}/{num2}")
    public String divide(@PathVariable int num1, @PathVariable int num2) {
        return  "Divide of " + num1 + " / " + num2 + " is " +   (num1 / num2);
    }
}
