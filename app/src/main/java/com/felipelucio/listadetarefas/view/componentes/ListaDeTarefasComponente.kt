package com.felipelucio.listadetarefas.view.componentes

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.felipelucio.listadetarefas.data.model.TarefaModel

@Composable
fun ListaDeTarefasComponente(
    modifier: Modifier,
) {
    val tarefas: List<TarefaModel> = remember {
        mutableListOf(
            TarefaModel(
                "Nova tarefa criada com sucesso dentro desta lista",
                "Esta é a descrição desta tarefa que acabou de ser criada dentro do aplicativo."
            ),
            TarefaModel(
                "Nova tarefa criada com sucesso dentro desta lista",
                "Esta é a descrição desta tarefa que acabou de ser criada dentro do aplicativo."
            ),
            TarefaModel(
                "Nova tarefa criada com sucesso dentro desta lista",
                "Esta é a descrição desta tarefa que acabou de ser criada dentro do aplicativo."
            ),
            TarefaModel(
                "Nova tarefa criada com sucesso dentro desta lista",
                "Esta é a descrição desta tarefa que acabou de ser criada dentro do aplicativo."
            ),
            TarefaModel(
                "Nova tarefa criada com sucesso dentro desta lista",
                "Esta é a descrição desta tarefa que acabou de ser criada dentro do aplicativo."
            ),
            TarefaModel(
                "Nova tarefa criada com sucesso dentro desta lista",
                "Esta é a descrição desta tarefa que acabou de ser criada dentro do aplicativo."
            ),
        )
    }
    LazyColumn(
        modifier = modifier.fillMaxWidth()
    ) {
        items(tarefas) {tarefa ->
            ItemDeTarefaComponente(modifier = Modifier, tarefa = tarefa)
        }
    }
}