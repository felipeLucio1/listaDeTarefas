package com.felipelucio.listadetarefas
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.felipelucio.listadetarefas.ui.theme.ListaDeTarefasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListaDeTarefasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ListaDeTarefasComponente(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ListaDeTarefasComponente(
    modifier: Modifier,
) {
    val tarefas: List<String> = remember { mutableListOf(
        "item 1",
        "item 2",
        "item 3",
        "item 4"
    ) }
    LazyColumn(
        modifier = modifier
    ) {
        items(tarefas) {tarefa ->
            ItemDeTarefaComponente(
                Modifier,
                tarefa
            )
        }
    }
}

@Composable
fun ItemDeTarefaComponente(modifier: Modifier ,tarefa: String) {
    Card(
        modifier = modifier
    ) {
        Text(tarefa)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListaDeTarefasTheme {
        Greeting("Android")
    }
}