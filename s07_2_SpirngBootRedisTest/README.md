# springBoot整合Redis
```
springboot
Redis
jdbc
```
## 1.springboot配置redis(也可不配置，使用默认)：
```
src/main/resources/application.yml
```

## 2.借用JDBC来试用事务管理
```
src/main/java/com/example/s07_2_spirngbootredistest/service/RedisService.java
```
- 需要配置JDBC、Mysql
- 可以直接保存key、value
- 可以将对象转换为json保存
