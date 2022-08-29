package com.example.s07_2_spirngbootredistest;

import com.example.s07_2_spirngbootredistest.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class S072SpirngBootRedisTestApplicationTests {

    @Resource
    StringRedisTemplate template;

    @Resource
    RedisService redisService;

    @Test
    void contextLoads() {
        template.opsForValue().set("xxx", "222");
        System.out.println(template.opsForValue().get("a"));

        template.delete("xxx");
        System.out.println(template.hasKey("xxx"));
    }

    @Test
    void testRedisJDBC(){
        redisService.testSet();
        redisService.testObjectRedisTemplate();
    }

}
