package ru.rom.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String getHello(@RequestParam int a,
                           @RequestParam int b,
                           @RequestParam String action,
                           Model model) {
        if ("addition".equals(action)) {
            model.addAttribute("result", (a + b));
        } else {
//          division
            model.addAttribute("result", (a - b));
        }
        return "first/say_hello";
    }
    @GetMapping("/bye")
    public String getBye() {
        return "first/say_bye";
    }
}
