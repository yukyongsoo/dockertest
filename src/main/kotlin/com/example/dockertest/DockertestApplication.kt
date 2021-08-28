package com.example.dockertest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockertestApplication

fun main(args: Array<String>) {
    runApplication<DockertestApplication>(*args)
}
