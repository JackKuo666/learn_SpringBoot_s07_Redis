package com.example;

import redis.clients.jedis.Jedis;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis = null;
        try {
            jedis = new Jedis("localhost", 6379);
            jedis.set("a", "222");
            System.out.println("a = " + jedis.get("a"));

            // hash
            jedis.hset("hhh", "name" , "小米");
            jedis.hset("hhh", "age" , "18");
            jedis.hgetAll("hhh").forEach((k,v) -> System.out.println(k + ": " + v));

            // list
            jedis.lpush("mylist", "111", "222", "333");
            jedis.lrange("mylist", 0, -1).forEach(System.out::println);
            //使用之后关闭连接
            jedis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
