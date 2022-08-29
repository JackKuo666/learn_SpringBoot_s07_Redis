package com.example.s07_2_spirngbootredistest.service;

import com.example.s07_2_spirngbootredistest.entity.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Service
public class RedisService {

    @Resource
    StringRedisTemplate template;

    @Resource
    RedisTemplate<Object, Object> objectRedisTemplate;

    @PostConstruct
    public void init(){
        template.setEnableTransactionSupport(true);   //需要开启事务
        objectRedisTemplate.setEnableTransactionSupport(true);
        objectRedisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
    }

    @Transactional    //需要添加此注解：事务
    public void testSet(){
        template.multi();
        template.opsForValue().set("d", "xxxxx");
        template.exec();
    }

    @Transactional    //需要添加此注解：事务
    public void testObjectRedisTemplate(){
        objectRedisTemplate.multi();
        objectRedisTemplate.opsForValue().set("objectxxx", new Student());
        objectRedisTemplate.exec();
    }



}