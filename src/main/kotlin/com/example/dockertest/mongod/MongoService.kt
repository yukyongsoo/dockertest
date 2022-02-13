package com.example.dockertest.mongod

import com.example.dockertest.mongod.Doc
import com.example.dockertest.mongod.DocRepo
import org.springframework.stereotype.Service

@Service
class MongoService(
    private val docRepo: DocRepo
) {
    fun write() {
        val doc = Doc(1,"test")

        docRepo.save(doc).block()
    }

    fun read(): Doc? {
       return docRepo.findById(1).block()
    }
}