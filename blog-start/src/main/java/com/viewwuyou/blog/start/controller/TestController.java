package com.viewwuyou.blog.start.controller;

import com.viewwuyou.blog.repository.model.DataTest;
import com.viewwuyou.blog.start.service.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    TestService testService;

    @RequestMapping("test/{id}")
    public String getTest(@PathVariable int id){
        DataTest dataTest = testService.getTest(id);

        if (dataTest != null) {
            return dataTest.toString();
        } else {
            return String.format("User(id: %s) not found", id);
        }
    }
}
