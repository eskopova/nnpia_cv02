package com.example.nnpia_cv02.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
//@Controller is used to mark classes as Spring MVC Controller.
//@RestController annotation is a special controller used in RESTful Web services,
// and it's the combination of @Controller and @ResponseBody annotation
public class HelloController
{
    // XML uses tags to define the elements and stores data in a tree structure,
    // whereas data in JSON is stored like a map with key/value pairs. YAML,
    // on the other hand,allows representation of data both in list or
    // sequence format and in the form of a map with key/value pairs.
    @GetMapping("")
    public String helloWorld() {
        return "Hello world from Spring Boot application.";
    }

    @GetMapping("/sayHello/{name}")
    public String helloSomebody(@PathVariable String name) { return "Hello " + name;}

    @RequestMapping(value = "/hiSomebody/{name}", method = RequestMethod.GET)
    public String getSomeGreetings(@PathVariable String name) {
        return "Hi " + name;
    }

    @GetMapping("/hi")
    public String foo(@RequestParam String name) {
        return "hi " + name;
    }
}
