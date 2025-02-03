package com.felipelucio.listadetarefas.view.componentes

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.felipelucio.listadetarefas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NovaTarefaTelaComponente(
    modifier: Modifier,
    onSalvarButtonClick: () -> Unit,
    onVoltarButtonClick: () -> Unit
) {
   Scaffold(
       modifier = modifier
           .padding(horizontal = 8.dp)
           .fillMaxSize(),
       topBar = {
           TopAppBar(
               colors = TopAppBarColors(
                   containerColor = MaterialTheme.colorScheme.background,
                   titleContentColor = MaterialTheme.colorScheme.onBackground,
                   scrolledContainerColor = MaterialTheme.colorScheme.background,
                   actionIconContentColor = MaterialTheme.colorScheme.onBackground,
                   navigationIconContentColor = MaterialTheme.colorScheme.onBackground,
               ),
               title = {
                   Text(stringResource(R.string.nova_tarefa))
               },
               navigationIcon = {
                   IconButton(onClick = onVoltarButtonClick) {
                       Icon(
                           imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                           contentDescription = stringResource(R.string.voltar)
                       )
                   }
               },
               actions = {
                   IconButton(onClick = onSalvarButtonClick) {
                       Icon(
                           imageVector = Icons.Filled.Check,
                           contentDescription = stringResource(R.string.salvar)
                       )
                   }
               }
           )
       }
   ) {innerpadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerpadding )
                .scrollable(
                    state = ScrollableState { 0f },
                    orientation = Orientation.Vertical,
                    enabled = true
                )
        ) {
            var titulo by remember { mutableStateOf("") }
            var descricao by remember { mutableStateOf("") }

            OutlinedTextField(
                value = titulo,
                onValueChange = {
                    titulo = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                label = {
                    Text(stringResource(R.string.titulo))
                },
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(MaterialTheme.colorScheme.outline)
            )

            OutlinedTextField(
                value = descricao,
                onValueChange = {
                    descricao = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                label = {
                    Text(stringResource(R.string.descricao_tarefa))
                },
                maxLines = 10,
                colors = OutlinedTextFieldDefaults.colors(MaterialTheme.colorScheme.outline)
            )
        }
    }
}