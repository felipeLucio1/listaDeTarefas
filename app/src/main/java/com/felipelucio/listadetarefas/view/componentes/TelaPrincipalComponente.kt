package com.felipelucio.listadetarefas.view.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.felipelucio.listadetarefas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaPrincipalComponente(modifier: Modifier, onNovaTarefaClick: () -> Unit) {
    Scaffold(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.surfaceContainer),
        topBar = {
            TopAppBar(
                colors = TopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                    scrolledContainerColor = MaterialTheme.colorScheme.primaryContainer,
                    actionIconContentColor = MaterialTheme.colorScheme.primary,
                    navigationIconContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(stringResource(R.string.lista_de_tarefas))
                }
            )
        },
        floatingActionButton = { NovaTarefaBotaoComponente(onNovaTarefaClick) }
    ) { innerPadding ->
        Column(
            modifier = modifier.padding(
                innerPadding
            )
                .background(color = MaterialTheme.colorScheme.background)
        ) {
            ListaDeTarefasComponente(Modifier)
        }
    }
}