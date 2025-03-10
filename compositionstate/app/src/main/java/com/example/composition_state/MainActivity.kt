package com.example.composition_state

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.unit.dp
import com.example.composition_state.ui.theme.CompositionstateTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnrememberedMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                var amountToCovert by remember {
                    mutableStateOf(0)
                }

                var currency by remember {
                    mutableStateOf("")
                }

                var convertedAmount by remember {
                    mutableStateOf(0.0)
                }

                Spacer(modifier = Modifier.height(24.dp))

                Text(text = "Currency Converter")

                Spacer(modifier = Modifier.height(24.dp))

                TextField(value = amountToCovert.toString(), onValueChange = { newText ->
                    amountToCovert = newText.toInt()
                })

                Spacer(modifier = Modifier.height(24.dp))

                TextField(value = currency, onValueChange = { newText ->
                    currency = newText
                })

                Button(onClick = {
                    if (currency == "eur") {
                        convertedAmount = amountToCovert * 7.5;
                    }
                }) {
                    Text(text = "Convert")
                }

                Text(text = "$amountToCovert is $convertedAmount in $currency")
            }
        }
    }
}
