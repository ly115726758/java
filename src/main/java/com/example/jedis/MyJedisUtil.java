package com.example.jedis;

import com.example.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.Jedis;

/**
 * @Author :凌勇.
 * @Date: Created  on 12:54 2018/1/8.
 */

public class MyJedisUtil {

    @Autowired
    StringRedisTemplate srt;

    RedisTemplate<String, User> rt;
    public void text(){



    }


}
