package project.sairenity.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(
    onBluetoothStateChanged:()->Unit
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.StartScreen.route){
        composable(Screen.StartScreen.route){
            StartScreen(navController = navController)
        }
        composable(Screen.PMScreen.route){
            PMScreen(
                onBluetoothStateChanged
            )
        }
    }
}


sealed class Screen(val route:String){
    object StartScreen:Screen("start_screen")
    object PMScreen:Screen("PM_screen")
}