package be.vdab.FirstSpringBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {

    @RequestMapping("/")
    public String sayHello() {
        return "Best First Spring Boot Start Page Ever";
    }

    @RequestMapping("/hello")
    public String sayHello2() {
        return "Best First Spring Boot Start Page Ever 2";
    }

}
