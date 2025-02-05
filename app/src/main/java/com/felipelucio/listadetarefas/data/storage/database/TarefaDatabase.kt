package com.felipelucio.listadetarefas.data.storage.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TarefaEntity::class], version = 1)
abstract class TarefaDatabase : RoomDatabase() {
    abstract fun tarefaDao(): TarefaDao
}