package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yushuo
 * @date 2018/9/11 23:22
 */
@RestController
public class TestController {

    @RequestMapping("/uu")
    public String say(){
        return "yushuo";
    }
    
    public String tr(){
        return "trceshi";
    }

}
