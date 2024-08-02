package com.example.demo.controller;

import com.example.demo.entity.Print;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
public class PrintController {
    @Autowired
    Print print;
    @GetMapping("/print")
    public String print(@RequestParam("name") String name){
       String output= "hello world ! my name is "+print.getName()+ "   how are you all specially  dear "+name ;
       return output;
    }
}
