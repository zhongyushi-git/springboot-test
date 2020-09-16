package com.zys.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongyushi
 * @date 2020/9/16 0016
 * @dec 描述
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "Hello jenkins,I am springboot!";
    }
}
