package com.felipelucio.listadetarefas.data.storage.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TarefaDao {
    @Query("SELECT * FROM tarefaentity")
    fun getAll(): List<TarefaEntity>

    @Insert
    fun insert(tarefa: TarefaEntity)

    @Delete
    fun delete(tarefa: TarefaEntity)
}