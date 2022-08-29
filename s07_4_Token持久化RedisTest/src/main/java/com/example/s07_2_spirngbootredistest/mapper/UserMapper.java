package com.example.s07_2_spirngbootredistest.mapper;

import com.example.s07_2_spirngbootredistest.cache.RedisMybatisCache;
import com.example.s07_2_spirngbootredistest.entity.Account;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@CacheNamespace(implementation = RedisMybatisCache.class)
@Mapper
public interface UserMapper {

    @Select("select * from users where name = #{name}")
    Account getAccountByUsername(String name);
}