package com.example.dockertest

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DockertestApplicationTests {
    @Autowired
    private lateinit var kafkaService: KafkaService
    @Autowired
    private lateinit var redisService: RedisService

    @Test
    fun `레디스 쓰기`() {
        redisService.put()
    }

    @Test
    fun `레디스 읽기`() {
        redisService.get()
    }

    @Test
    fun `카프카 쓰기`() {
        kafkaService.produce()
    }
}
