package com.example.dockertest.kafka

import org.springframework.cloud.stream.annotation.Input
import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.SubscribableChannel

interface ChanndelDescription {
    @Output("test")
    fun getSenderChannel(): MessageChannel

    @Input("test")
    fun getReadChannel(): SubscribableChannel
}