package com.common.interfaces

import javax.swing.text.html.parser.Entity

interface IRepository<TEntity> {
    suspend fun GetAll()
    suspend fun GetById(id:String)
    suspend fun Remove(id: String)
    suspend fun Add(entity: TEntity)
    suspend fun Update(entity: TEntity)

}