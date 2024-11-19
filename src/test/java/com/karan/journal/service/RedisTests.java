package com.karan.journal.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SpringBootTest
public class RedisTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void setRedisTemplate() {
//        redisTemplate.opsForValue().set("email", "karan@gamil.com");
        Object email = redisTemplate.opsForValue().get("email");
        int a =1;

    }

}
