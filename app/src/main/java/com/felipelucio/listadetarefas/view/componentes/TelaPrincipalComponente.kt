package com.felipelucio.listadetarefas.view.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TelaPrincipalComponente(modifier: Modifier) {
    Column(
        modifier = modifier.padding(
            start = 8.dp,
            end = 8.dp
        )
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        ListaDeTarefasComponente(Modifier)
    }
}