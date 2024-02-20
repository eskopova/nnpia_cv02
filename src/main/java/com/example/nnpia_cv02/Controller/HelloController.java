package com.example.nnpia_cv02.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
//@Controller is used to mark classes as Spring MVC Controller.
//@RestController annotation is a special controller used in RESTful Web services,
// and it's the combination of @Controller and @ResponseBody annotation
public class HelloController
{
    @GetMapping("")
    public String helloWorld() {
        return "Hello world from Spring Boot application.";
    }
}
