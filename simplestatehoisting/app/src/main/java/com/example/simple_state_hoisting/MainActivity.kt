package com.example.simple_state_hoisting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.simple_state_hoisting.ui.theme.SimplestatehoistingTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //ApplicationNoMVVM()

            var list = remember {
                mutableStateListOf("asd")
            }

            Button(onClick = {
                list.add("aaaa")
            }) { }

            LazyColumn {
                items(list) {
                    Text(it)
                }
            }
        }
    }
}



@Composable
fun ApplicationMVVM() {
    // Create a new viewModel
    val buttonViewmodel = viewModel<ButtonViewmodel>();

    RandomButtonStateHoisted(buttonViewmodel.count, buttonViewmodel.buttonText, {
        buttonViewmodel.onButtonClicked()
    })
}

@Composable
fun ApplicationNoMVVM() {
    var count by remember { mutableStateOf(0) }
    var buttonText by remember { mutableStateOf("") }

    RandomButtonStateHoisted(count, buttonText) {
        val randomInt = Random.nextInt(1, 100)
        if(randomInt <= 33) {
            buttonText = "$randomInt is a small number"
        } else if (randomInt <= 66) {
            buttonText = "$randomInt is a medium number"
        } else {
            buttonText = "$randomInt is a large number"
        }
        count++
    }
}

@Composable
fun RandomButtonStateHoisted(count: Int, buttonText: String, onButtonClicked: () -> Unit) {
    Button(onClick = onButtonClicked) {
        Text("$buttonText. You have clicked $count number of times")
    }
}

@Composable
fun RandomButtonWithState() {
    var count by remember { mutableStateOf(0) }
    var buttonText by remember { mutableStateOf("") }

    Button(onClick = {
        val randomInt = Random.nextInt(1, 100)
        if(randomInt <= 33) {
            buttonText = "$randomInt is a small number"
        } else if (randomInt <= 66) {
            buttonText = "$randomInt is a medium number"
        } else {
            buttonText = "$randomInt is a large number"
        }
        count++
    }) {
        Text("$buttonText. You have clicked $count number of times")
    }
}
