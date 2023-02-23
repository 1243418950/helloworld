package com.example.helloworld.controller;

import com.example.helloworld.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value = "/*.json")
    public String hello(@RequestParam(value = "nickname",required = false) String name, String phone){
        return "你好 "+name+" 您的电话："+phone;
    }

    @RequestMapping("/ttt")
    public String hello2(@RequestBody User u){
        return u.toString();
    }
}
