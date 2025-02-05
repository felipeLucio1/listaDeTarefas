package com.felipelucio.listadetarefas

import android.app.Application
import androidx.room.Room
import com.felipelucio.listadetarefas.data.storage.database.TarefaDatabase

lateinit var tarefaBancoDeDados: TarefaDatabase

class ListaDeTarefaApplication() : Application() {
    override fun onCreate() {
        super.onCreate()
        tarefaBancoDeDados = Room.databaseBuilder(
            applicationContext,
            TarefaDatabase::class.java, getString(R.string.tarefa_database)
        ).build()
    }
}