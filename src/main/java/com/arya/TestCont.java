package com.arya;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCont {

    @GetMapping
    public String helloworld(){
        return "Hello world";
    }
}
