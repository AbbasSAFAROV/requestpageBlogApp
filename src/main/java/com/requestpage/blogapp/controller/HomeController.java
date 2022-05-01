package com.requestpage.blogapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

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

    @GetMapping("/deneme")
    public String deneme(@RequestParam(name = "size") String size, Model model){
        model.addAttribute("key",size);
        return "deneme";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
