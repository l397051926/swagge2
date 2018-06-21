package com.lmx.swagge2.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author liumingxin
 * @create 2018 20 9:42
 * @desc  http://localhost:8080/swagger-ui.html
 **/
@RestController
@RequestMapping("/hello")
public class HelloWord {

    @RequestMapping(value = "/healthy",method = RequestMethod.GET)
    public String helloTest(){
        return "hello !  this is swagge2";
    }

    @ApiOperation(value = "测试swagge2 功能",notes = "")
    @RequestMapping(value = "/swaggerTest1" , method = RequestMethod.POST)
    public String swagger2Test(){
        return "测试 swagge2 功能1 ";
    }

    @ApiOperation(value = "测试swagge2 功能2",notes = "根据具体情况使用")
    @ApiImplicitParam(name = "param",value = "测试参数" , required = true,dataType = "String")
    @RequestMapping(value = "/swaggerTest2" ,method = RequestMethod.GET)
    public String swagger2Test2(String param){
        return "测试 swagge2 功能2, 获取的参数: "+param;
    }

    @ApiOperation(value = "测试 swagger2 功能3",notes = "参数问题")
    @ApiImplicitParam(name = "param",value = "测试参数2" ,required = true,dataType = "JsonObject")
    @RequestMapping(value = "/swaggerTest3",method = RequestMethod.POST)
    public String swagger2Test3(@RequestBody String param){
        return "测试 swagge2 功能3， 获取参数： " + param;
    }







}
