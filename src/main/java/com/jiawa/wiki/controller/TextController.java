package com.jiawa.wiki.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

//@Controller
@RestController
public class TextController {
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping(value = "/hello",method=RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(){

        return "Hello World";
    }

    @PostMapping("/hello/post")
    public String helloPost(Map<String,String> map){

        return "Hello World"+map.get("name");
    }
}
