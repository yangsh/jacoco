package com.yangsh.jacoco.controller;

import com.yangsh.jacoco.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description: TODO
 * <p></p>
 * Author: shaoye
 * Date: 2019-05-24 23:50
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return helloService.sayHello();
    }

}
