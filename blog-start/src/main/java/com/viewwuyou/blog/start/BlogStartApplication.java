package com.viewwuyou.blog.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.viewwuyou.blog")
@MapperScan("com.viewwuyou.blog.repository.mapper")
public class BlogStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogStartApplication.class, args);
    }

}
