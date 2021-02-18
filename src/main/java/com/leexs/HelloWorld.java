package com.leexs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String sayHello(String name){
        System.out.println("hello," + name);
        return "hello" + name;
    }
}
