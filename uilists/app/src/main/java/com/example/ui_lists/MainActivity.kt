package com.example.ui_lists

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

val TAG = "idea"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IdeaGenerator()
        }
    }
}

@Composable
fun IdeaGenerator() {
    var ideas by remember {
        mutableStateOf(mutableStateListOf(""))
    }

    //ideas.removeAt(0)

    var idea by remember {
        mutableStateOf("")
    }

    Column {
        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Idea generator")

        Spacer(modifier = Modifier.height(24.dp))

        TextField(value = idea, onValueChange = { newText ->
            Log.d(TAG, newText)
            idea = newText
        })

        Button(onClick = {
            ideas.add(idea)
            idea = ""
        }) {
            Text(text = "Create new idea")
        }

        LazyColumn {
            items(ideas) { idea ->
                Idea(idea)
            }
        }
    }
}

@Composable
fun Idea(text: String) {
    Row  {
        Text(text = text)
        Button(onClick = {

        }) {
            Text(text = "Delete idea")
        }
    }

}