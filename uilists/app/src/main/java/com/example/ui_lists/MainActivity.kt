package com.example.ui_lists

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_lists.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var ideas: MutableList<String> by remember {
                mutableStateOf(mutableStateListOf())
            }

            var newIdea by remember {
                mutableStateOf("")
            }

            Column() {
                TextField(value = newIdea, onValueChange = { newText ->
                    newIdea = newText
                })

                Button(onClick = {
                    ideas.add(newIdea)
                }) {
                    Text(text = "Create new idea")
                }

                LazyColumn {
                    items(ideas) { idea ->
                        Row {
                            Text(idea)
                            Button(onClick = {
                                ideas.remove(idea)
                            }) {
                                Text(text = "slet ide")
                            }
                        }
                    }
                }
            }
        }
    }
}

