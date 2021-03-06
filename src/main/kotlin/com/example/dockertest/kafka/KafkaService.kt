package com.example.dockertest.kafka

import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Service

@Service
class KafkaService(
    private val kafkaDescription: KafkaDescription
) {
    fun produce() {
        kafkaDescription.getSenderChannel()
            .send(MessageBuilder.withPayload("asdf").build())
    }

    @StreamListener("test")
    fun read(word: String) {
        println(word)
    }
}