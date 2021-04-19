package com.example.controller;

import com.example.model.Topics;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class v1Controllers {

    @RequestMapping("/welcome")
    public String greet(){
        return "Welcome to Spring Project";
    }

    @RequestMapping("/alltopics")
    public List<Topics> getAllTopics(){
        return Arrays.asList(
                new Topics(1,"Spring","part1"),
                new Topics(2,"SpringBoot","part2"),
                new Topics(3,"SpringSecurity","part3")
        );
    }
}
