package com.sxu.crm.basic.config.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @author 李今朝
 * @className GetRedisTemplate
 * @version1.0
 * @description 获取RedisTemplate和ValueOperations
 * @createdTime 2020/3/22 21:51
 */
public class GetRedisTemplate {
    @Autowired
    public static RedisTemplate redisTemplate;

    public static ValueOperations getRedis() {
        return redisTemplate.opsForValue();
    }
}
