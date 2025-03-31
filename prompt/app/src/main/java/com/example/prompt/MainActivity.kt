package com.example.prompt

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.prompt.ui.theme.PromptTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModelTest = viewModel<TestViewModel>()
            Column {
                TextFieldCustom(viewModelTest.name, viewModelTest::onTextChanged)

                Button(onClick = viewModelTest::onNewPromptClick) {
                    Text("Create new Prompt")
                }
            }
        }
    }
}

@Composable
fun TextFieldCustom(name: String, onTextChanged: (String) -> Unit) {
    TextField(value = name, onValueChange = onTextChanged)
}





