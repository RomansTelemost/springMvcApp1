package ru.rom.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hh")
    public String sayHello() {
        return "hello_world";
    }
}
