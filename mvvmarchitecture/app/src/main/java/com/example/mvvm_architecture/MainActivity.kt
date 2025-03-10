package com.example.mvvm_architecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvm_architecture.ui.theme.MvvmarchitectureTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val jokesViewModel = viewModel<JokeViewModel>();
            JokeListScreen(jokes = jokesViewModel.jokes, onAddJoke = {jokesViewModel.addJoke()})
        }
    }
}

class JokeViewModel : ViewModel() {
    val jokes by mutableStateOf(
        mutableStateListOf("Why don’t skeletons fight each other? They don’t have the guts.")
    )

    fun addJoke() {
        val newJoke = "Why did the scarecrow win an award? Because he was outstanding in his field."
        jokes.add(newJoke)
    }
}

@Composable
fun JokeListScreen(jokes: MutableList<String>, onAddJoke: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = onAddJoke) {
            Text("Add Joke")
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(jokes) { joke ->
                Text(
                    text = joke,
                    modifier = Modifier.padding(8.dp),
                    fontSize = 16.sp
                )
            }
        }
    }
}


//
//@Composable
//fun JokeListScreen(jokes) {
//    var jokes by remember { mutableStateOf(mutableStateListOf("Why don’t skeletons fight each other? They don’t have the guts.")) }
//
//    Column(
//        modifier = Modifier.fillMaxSize().padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Button(onClick = {
//            val newJoke = "Why did the scarecrow win an award? Because he was outstanding in his field."
//            jokes.add(newJoke)
//        }) {
//            Text("Add Joke")
//        }
//        Spacer(modifier = Modifier.height(16.dp))
//        LazyColumn {
//            items(jokes) { joke ->
//                Text(
//                    text = joke,
//                    modifier = Modifier.padding(8.dp),
//                    fontSize = 16.sp
//                )
//            }
//        }
//    }
//}

class JokeViewModel : ViewModel() {
    val jokes by mutableStateOf(
        mutableStateListOf("Why don’t skeletons fight each other? They don’t have the guts.")
    )

    fun addJoke() {
        val newJoke = "Why did the scarecrow win an award? Because he was outstanding in his field."
        jokes.add(newJoke)
    }
}

@Composable
fun JokeListScreen(jokes: MutableList<String>, onAddJoke: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = onAddJoke) {
            Text("Add Joke")
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(jokes) { joke ->
                Text(
                    text = joke,
                    modifier = Modifier.padding(8.dp),
                    fontSize = 16.sp
                )
            }
        }
    }
}

