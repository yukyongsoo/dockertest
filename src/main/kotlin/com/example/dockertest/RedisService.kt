package com.example.dockertest

import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service

@Service
class RedisService(
    private val redis: RedisTemplate<String, String>
) {
    fun put() {
        val opsForValue = redis.opsForValue()
        opsForValue.set("1","1")
    }

    fun get() {
        val opsForValue = redis.opsForValue()
        val get = opsForValue.get("1")
        println(get)
    }
}