package com.felipelucio.listadetarefas.view
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import com.felipelucio.listadetarefas.view.navigation.NavigationController
import com.felipelucio.listadetarefas.view.ui.theme.TemaDoApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TemaDoApp {
                NavigationController(Modifier)
            }
        }
    }
}
