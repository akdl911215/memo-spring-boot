package com.launch.menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);
    }

    @GetMapping("/")
    public String doGEtHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/mune")
    public String doGetHelloWorldMenu() {
        return "Hello World Menu";
    }
}
