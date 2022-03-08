package com.example.dockertest

import com.example.dockertest.kinesis.KinesisService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Service

@Service
class KinesisMessageSender(
    private val kinesisService: KinesisService
) : ApplicationRunner {
    override fun run(args: ApplicationArguments) {
        kinesisService.produce()
    }
}