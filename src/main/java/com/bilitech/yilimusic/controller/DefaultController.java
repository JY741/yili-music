package com.bilitech.yilimusic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JY
 * @create 2021-12-31 16:13
 */
@RestController
@RequestMapping("/hello")
public class DefaultController {

    @RequestMapping
    public String sayHello(){
        return "Hello Everyone!";
    }
}
