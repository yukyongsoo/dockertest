package com.example.dockertest

import com.example.dockertest.kafka.ChanndelDescription
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding

@SpringBootApplication
@EnableBinding(ChanndelDescription::class)
class DockertestApplication

fun main(args: Array<String>) {
    runApplication<DockertestApplication>(*args)
}
