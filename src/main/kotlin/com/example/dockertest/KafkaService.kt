package com.example.dockertest

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaService(
    private val sender: KafkaTemplate<String, String>
) {
    companion object {
        private const val TOPIC = "multi"
    }

    fun produce() {
        sender.send(TOPIC, "aaaa")
    }

    //카프카는 자동으로 새로운 인스턴스가 생성될 때 파티션 분배를 한다
    @KafkaListener(topics = [TOPIC], groupId = "test-consumer-group")
    fun consume(message: String) {
        println(message)
    }
}