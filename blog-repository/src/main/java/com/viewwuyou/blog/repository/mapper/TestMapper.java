package com.viewwuyou.blog.repository.mapper;


import com.viewwuyou.blog.repository.model.DataTest;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper {

    DataTest getTest(int id);

}
