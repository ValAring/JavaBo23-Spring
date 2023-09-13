package com.example.helloworldcontroller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public String getHello(){
        return "Hello Outer Space";
    }

    @GetMapping("/{name}")
    @ResponseBody
    public String getHelloName(@PathVariable String name){
        return "Hello " + name;
    }

}
