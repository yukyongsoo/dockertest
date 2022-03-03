package com.example.dockertest

import com.example.dockertest.kafka.KafkaService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Service

@Service
class KafkaMessageSender(
    private val kafkaService: KafkaService
) : ApplicationRunner {
    override fun run(args: ApplicationArguments) {
        kafkaService.produce()
    }
}