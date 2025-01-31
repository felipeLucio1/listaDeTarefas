package com.felipelucio.listadetarefas.view.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ItemDeTarefaComponente(modifier: Modifier, tarefa: String) {
    Card(
        modifier = modifier.fillMaxWidth()
            .padding(vertical = 4.dp)
            .height(200.dp),
        colors = CardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer,
            contentColor = MaterialTheme.colorScheme.onSurface,
            disabledContentColor = MaterialTheme.colorScheme.onSurface,
            disabledContainerColor = MaterialTheme.colorScheme.surfaceContainerLowest,
        )
    ) {
        Column {
            Row{
                Text(
                    modifier = modifier.padding(top = 16.dp, start = 8.dp)
                        .weight(2f),
                    text = tarefa
                )
                Row(
                    Modifier.fillMaxWidth()
                        .wrapContentHeight()
                        .weight(1f)
                ) {
                    IconButton(
                        {},
                        Modifier.weight(1f)
                            .wrapContentSize()
                            .padding(end = 4.dp),
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceContainer)
                    ) {
                        Icon(Icons.Outlined.Delete, "Excluir tarefa")
                    }
                }
            }
            HorizontalDivider(
                Modifier.padding(
                    top = 16.dp,
                    start = 8.dp,
                    end = 8.dp
                ),
                color = MaterialTheme.colorScheme.outlineVariant,
                thickness = 1.dp
            )
        }
    }
}