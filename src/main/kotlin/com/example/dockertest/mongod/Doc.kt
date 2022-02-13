package com.example.dockertest.mongod

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "test")
class Doc(
    @Id val id: Int? = null,
    val name: String
)