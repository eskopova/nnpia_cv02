package com.example.nnpia_cv02.Controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/say_hello_to_me/{name}")
    public String helloSomebody(@PathVariable String name) { return "Hello " + name;}

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String getSomeGreetings(@PathVariable String name) {
        return "Hi " + name;
    }
}
