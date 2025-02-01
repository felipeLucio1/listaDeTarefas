package com.felipelucio.listadetarefas.view.componentes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NovaTarefaBotaoCOmponente(onCLick: () -> Unit) {
    FloatingActionButton(
        onClick = onCLick,
    ) {
        Icon(Icons.Outlined.Add, "Criar nonva tarefa")
    }
}