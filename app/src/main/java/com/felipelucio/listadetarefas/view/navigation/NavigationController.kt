package com.felipelucio.listadetarefas.view.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.felipelucio.listadetarefas.view.componentes.NovaTarefaTelaComponente
import com.felipelucio.listadetarefas.view.componentes.TelaPrincipalComponente

@Composable
fun NavigationController(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = TelaPrincipal,
        modifier = modifier,
    ) {
        composable<TelaPrincipal> {
            TelaPrincipal
        }
        composable<TelaPrincipal> {
            TelaPrincipalComponente(
                modifier = modifier,
                onNovaTarefaClick = {
                    navController.navigate(NovaTarefa)
                }
            )
        }

        composable<NovaTarefa> {
            NovaTarefaTelaComponente(
                modifier = modifier,
                onSalvarButtonClick = {
                    navController.popBackStack()
                },
                onVoltarButtonClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}