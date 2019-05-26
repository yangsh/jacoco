package com.yangsh.jacoco.service;

import com.yangsh.jacoco.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Description: TODO
 * <p></p>
 * Author: shaoye
 * Date: 2019-05-25 23:37
 */
@SpringBootTest(classes = Application.class)
public class OtherServiceTests extends AbstractTestNGSpringContextTests {

    @Resource
    private OtherService otherService;

    @Test
    public void someMethod() {
        NotBean nb = new NotBean();
        Assert.assertEquals("Other", otherService.someMethod());
    }

}
