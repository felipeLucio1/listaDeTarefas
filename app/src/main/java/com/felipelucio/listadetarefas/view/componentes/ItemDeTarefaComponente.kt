package com.felipelucio.listadetarefas.view.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.felipelucio.listadetarefas.data.model.TarefaModel

@Composable
fun ItemDeTarefaComponente(modifier: Modifier, tarefa: TarefaModel) {
    Card(
        modifier = modifier.fillMaxWidth()
            .padding(vertical = 4.dp)
            .wrapContentHeight(),
        colors = CardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer,
            contentColor = MaterialTheme.colorScheme.onSurface,
            disabledContentColor = MaterialTheme.colorScheme.onSurface,
            disabledContainerColor = MaterialTheme.colorScheme.surfaceContainerLowest,
        )
    ) {
        Column(
            modifier = Modifier.padding(all = 8.dp)
        ) {
            Row{
                tarefa.titulo?.let {
                    Text(
                        modifier = modifier.padding(top = 16.dp)
                            .weight(2f),
                        text = it,
                        maxLines = 1,
                        fontWeight = FontWeight.Bold
                    )
                }
                Row(
                    Modifier.fillMaxWidth()
                        .wrapContentHeight()
                        .weight(1f)
                ) {
                    IconButton(
                        {},
                        Modifier.weight(1f)
                            .wrapContentSize(),
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceContainer)
                    ) {
                        Icon(Icons.Outlined.Check, "Excluir tarefa")
                    }
                }
            }
            HorizontalDivider(
                Modifier.padding(
                    vertical = 8.dp
                ),
                color = MaterialTheme.colorScheme.outlineVariant,
                thickness = 1.dp
            )
            Text(
                modifier = Modifier,
                text = tarefa.descricao,
                maxLines = 3,
                fontWeight = FontWeight.W100,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}