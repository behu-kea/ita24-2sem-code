package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.compose.foundation.lazy.items
import com.example.navigation.ui.theme.NavigationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            class MainActivity : ComponentActivity() {
                override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)

                    setContent {
                        Text(text = "asdasds")
                        //val navController = rememberNavController()
//
//                        Column {
//                            Text(
//                                text = "Navigation App Example",
//                                fontSize = 45.sp
//                            )
//                            NavHost(navController = navController, startDestination = "list") {
//                                composable("home-screen") {
//                                    HomeScreen("benjamin",
//                                        onArgumentsButtonClick = {
//                                            val stringToSend = "Benjamin"
//                                            // this is how the "url" will look: sendArgumentsHere/Benjamin
//                                            navController.navigate("sendArgumentsHere/${stringToSend}")
//                                        })
//                                }
//                                composable("sendArgumentsHere/{name}", arguments = listOf(navArgument("name") { type = NavType.StringType })) { backStackEntry ->
//                                    val name = backStackEntry.arguments?.getString("name") ?: return@composable
//                                    SendArgumentsHere(name)
//                                }
//                                composable ("list") {
//                                    val test: List<String> = listOf("banan", "æble")
//                                    Column {
//                                        Text(text = "test")
//                                        LazyColumn {
//                                            items(test) { string ->
//                                                Text(text = string)
//                                            }
//                                        }
//                                    }
//
//                                }
//                            }
//                        }
                    }
                }
            }
        }
    }
}

@Composable
fun HomeScreen(name: String, onArgumentsButtonClick: () -> Unit) {
    Column {
        Text(
            text = "Screen 1",
            fontSize = 32.sp
        )
        Text(
            text = "Hello $name!"
        )
        Button(onClick = onArgumentsButtonClick) {
            Text("To arguments screen")
        }
    }
}

@Composable
fun SendArgumentsHere(name: String) {
    Text(text = "This is from the arguments: $name")
}