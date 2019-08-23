package com.repository.mongodb
import org.litote.kmongo.reactivestreams.*
import org.litote.kmongo.coroutine.*

sealed class MongoRepository<T : Any>(collectionName: String) {

    // val MongoCollection: CoroutineCollection<T>

    private val _collectionName: String = collectionName
    private val _mangoClient: CoroutineClient = KMongo.createClient().coroutine
    private val _mangoDatabase: CoroutineDatabase
    private val _connectionString: String = "mongodb://localhost:27017"
    private var _dataBaseName: String = "bochkysimple"

    init {

        _mangoDatabase = _mangoClient.getDatabase(_dataBaseName)

        //TODO: add mongocollection
        // MongoCollection = _mangoDatabase.getCollection)



}