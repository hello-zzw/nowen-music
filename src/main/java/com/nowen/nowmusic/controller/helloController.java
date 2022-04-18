package com.nowen.nowmusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 赵志文
 * @date 2022/4/18
 */
@RestController
public class helloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "你好！";
    }
}
