package com.example.dockertest.mongod

import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface DocRepo : ReactiveMongoRepository<Doc, Int>