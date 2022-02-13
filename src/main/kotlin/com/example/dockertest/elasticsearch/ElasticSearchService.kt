package com.example.dockertest.elasticsearch

import org.springframework.data.elasticsearch.core.ElasticsearchOperations
import org.springframework.stereotype.Service

@Service
class ElasticSearchService(
    private val elasticSearchOperations: ElasticsearchOperations,
) {
    fun write() {
        val doc = Doc(1, "asdf")

        elasticSearchOperations.save(doc)
    }

    fun read(): Doc? {
        return elasticSearchOperations.get("1", Doc::class.java)
    }
}