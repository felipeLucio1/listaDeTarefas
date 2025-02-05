package com.felipelucio.listadetarefas.data.storage.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TarefaEntity(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "tarefa_titulo") val titulo: String?,
    @ColumnInfo(name = "tarefa_descricao") val descricao: String
)