package com.example.simple_state_hoisting

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class ButtonViewmodelWithModel: ViewModel() {
    var count by mutableStateOf(0)
    var buttonText by mutableStateOf("")

    fun onButtonClicked (){
        val randomNumberObj = RandomNumber()
        if(randomNumberObj.randomInt <= 33) {
            buttonText = "${randomNumberObj.randomInt} is a small number"
        } else if (randomNumberObj.randomInt <= 66) {
            buttonText = "${randomNumberObj.randomInt} is a medium number"
        } else {
            buttonText = "${randomNumberObj.randomInt} is a large number"
        }

        count++
    }
}