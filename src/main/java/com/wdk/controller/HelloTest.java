package com.wdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author:wang_dk
 * @Date:2019/12/3 0003 22:19
 * @Version: v1.0
 **/

@RestController
@RequestMapping("/test/hello")
public class HelloTest {

    @RequestMapping(value="/index")
    public String index(){
        System.out.println("~~~~~~~~~~~~~~~~~");
        return "cao....";
    }
}
