package com.jiawa.wiki.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class TextController {
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping(value = "/hello",method=RequestMethod.GET)
    @RequestMapping("/hello")
    public String hello(){

        return "helloworld";
    }
}
