package ru.rom.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ho")
public class FirstController {
    @GetMapping("/hello")
    public String getHello() {
        return "first/say_hello";
    }
    @GetMapping("/bye")
    public String getBye() {
        return "first/say_bye";
    }
}
