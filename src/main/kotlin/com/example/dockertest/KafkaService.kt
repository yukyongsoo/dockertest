package com.example.dockertest

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaService(
    private val sender: KafkaTemplate<String, String>
) {
    companion object {
        private const val TOPIC = "topic"
    }

    fun produce() {
        sender.send(TOPIC, "aaaa")
    }

    @KafkaListener(topics = [TOPIC], groupId = "test-consumer-group")
    fun consume(message: String) {
        println(message)
    }
}