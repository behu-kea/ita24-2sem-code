package com.example.simple_state_hoisting

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class ButtonViewmodel:ViewModel() {
    var count by mutableStateOf(0)
    var buttonText by mutableStateOf("")

    fun onButtonClicked (){
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