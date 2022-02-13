package com.example.dockertest.elasticsearch

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document


@Document(indexName = "doc")
class Doc(
    @Id val id: Int?  = null,
    val name: String
)