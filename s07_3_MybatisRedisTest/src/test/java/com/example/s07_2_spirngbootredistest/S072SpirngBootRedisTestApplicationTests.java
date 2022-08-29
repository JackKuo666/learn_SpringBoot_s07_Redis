package com.example.s07_2_spirngbootredistest;

import com.example.s07_2_spirngbootredistest.mapper.MainMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class S072SpirngBootRedisTestApplicationTests {

    @Resource
    MainMapper mapper;

    @Test
    void contextLoads() {
        System.out.println(mapper.getSid());
        System.out.println(mapper.getSid());
        System.out.println(mapper.getSid());
    }
}
