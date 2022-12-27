package com.learning.chapter3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hellocontroller {

    @RequestMapping("say-hello")
    public String sayHello() {
        return "Hello! What's new today";
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }

    

}
