package com.example.dockertest.kinesis

import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Service

@Service
class KinesisService(
    private val kinesisDescription: KinesisDescription
) {
    fun produce() {
        kinesisDescription.getSenderChannel()
            .send(MessageBuilder.withPayload("asdf").build())
    }

    @StreamListener("test-kinesis")
    fun read(word: String) {
        println(word)
    }
}