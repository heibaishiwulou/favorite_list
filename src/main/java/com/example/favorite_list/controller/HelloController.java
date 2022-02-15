package com.example.favorite_list.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName helloController
 * @Description TODO
 * @date 2022/2/10 17:10
 * @Version 1.0
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public  String test(){
        return "test";
    }
}
