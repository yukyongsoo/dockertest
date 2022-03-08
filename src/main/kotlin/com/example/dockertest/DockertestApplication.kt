package com.example.dockertest

import com.example.dockertest.kafka.KafkaDescription
import com.example.dockertest.kinesis.KinesisDescription
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding

@SpringBootApplication
@EnableBinding(KafkaDescription::class, KinesisDescription::class)
class DockertestApplication

fun main(args: Array<String>) {
    runApplication<DockertestApplication>(*args)
}
