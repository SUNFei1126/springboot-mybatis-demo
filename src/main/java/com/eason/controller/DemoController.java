package com.eason.controller;

import com.eason.pojo.Code;
import com.eason.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description ${description}
 * Created by sunyufei on 2019/1/18.
 */
@RestController
@RequestMapping(value = {"/demo"})
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = {"/find"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public String getAllUsers(){
        Code code=  demoService.findOneCode(1);
        String md = code.getCode();
        return md;
    }
    @RequestMapping(value = {"/index"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public String index(){
        String md = "hello index";
        return md;
    }
}
