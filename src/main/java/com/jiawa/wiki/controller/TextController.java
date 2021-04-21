package com.jiawa.wiki.controller;


import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

//@Controller
@RestController
public class TextController {

    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;


//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping(value = "/hello",method=RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(){

        return "Hello World"+testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(Map<String,String> map){

        return "Hello World"+map.get("name");
    }

    @GetMapping("/test/list")
    public List<Test> list(){

        return testService.list();
    }
}
