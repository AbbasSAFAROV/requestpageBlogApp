package com.requestpage.blogapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String index(){
        return "index";
    }

    @GetMapping("/posts")
    public String post(){
        return "post";
    }

    @GetMapping("/author")
    public String author(){
        return "author";
    }

}
