package com.example.dockertest.kinesis

import org.springframework.cloud.stream.annotation.Input
import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.SubscribableChannel

interface KinesisDescription {
    @Output("test-kinesis")
    fun getSenderChannel(): MessageChannel

    @Input("test-kinesis")
    fun getReadChannel(): SubscribableChannel
}