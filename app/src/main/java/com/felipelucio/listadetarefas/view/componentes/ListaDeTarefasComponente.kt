package com.felipelucio.listadetarefas.view.componentes

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListaDeTarefasComponente(
    modifier: Modifier,
) {
    val tarefas: List<String> = remember {
        mutableListOf(
            "item 1",
            "item 2",
            "item 3",
            "item 4"
        )
    }
    LazyColumn(
        modifier = modifier.fillMaxWidth()
    ) {
        items(tarefas) { tarefa ->
            ItemDeTarefaComponente(
                Modifier,
                tarefa
            )
        }
    }
}