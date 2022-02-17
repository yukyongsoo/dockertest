package com.example.dockertest

import com.example.dockertest.elasticsearch.ElasticSearchService
import com.example.dockertest.mongod.MongoService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DockertestApplicationTests {
    @Autowired
    private lateinit var kafkaService: KafkaService
    @Autowired
    private lateinit var redisService: RedisService
    @Autowired
    private lateinit var mongoService: MongoService
    @Autowired
    private lateinit var elasticSearchService: ElasticSearchService
    
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
        for (i in 1..1000)
            kafkaService.produce()
    }

    @Test
    fun `몽고 쓰기`() {
        mongoService.write()
    }

    @Test
    fun `몽고 읽기`() {
        val doc = mongoService.read()
        println(doc)
    }

    @Test
    fun `ES 쓰기`() {
        elasticSearchService.write()
    }

    @Test
    fun `ES 읽기`() {
        elasticSearchService.write()

        elasticSearchService.read()
    }
}
