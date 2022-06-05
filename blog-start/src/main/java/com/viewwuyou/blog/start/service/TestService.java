package com.viewwuyou.blog.start.service;


import com.viewwuyou.blog.repository.mapper.TestMapper;
import com.viewwuyou.blog.repository.model.DataTest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService {

    @Resource
    TestMapper testMapper;


    public DataTest getTest(int id){
        return testMapper.getTest(id);
    }

}
