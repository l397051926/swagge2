package com.lmx.swagge2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liumingxin
 * @create 2018 20 9:42
 * @desc
 **/
@Controller
@RequestMapping("/hello")
public class HelloWord {

    @RequestMapping("/helthy")
    @ResponseBody
    public String helloTest(){
        return "hello !  this is swagge2";
    }

}
