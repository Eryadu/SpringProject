package io.pragra.feb2025ioc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("/home")
    public String display(){
        return "First Spring Boot Project";
    }
}
