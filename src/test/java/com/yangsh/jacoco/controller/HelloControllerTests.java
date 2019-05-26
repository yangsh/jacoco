package com.yangsh.jacoco.controller;

import com.yangsh.jacoco.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: TODO
 * <p></p>
 * Author: shaoye
 * Date: 2019-05-25 21:57
 */
@SpringBootTest(classes = Application.class)
public class HelloControllerTests extends AbstractTestNGSpringContextTests {

    @Resource
    private HelloController helloController;

    @Test
    public void sayHello() {
        List<Object> list = new ArrayList<>();
        Assert.assertEquals("Hello", helloController.sayHello());
    }

}
