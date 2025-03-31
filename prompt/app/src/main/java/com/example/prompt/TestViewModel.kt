package com.example.prompt

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.prompt.data.PromptRepository
import kotlinx.coroutines.launch

class TestViewModel: ViewModel() {
    val promptRepository = PromptRepository()
    var name by mutableStateOf("hej")

    fun onTextChanged(newText: String) {
        name = newText;
    }

    fun onNewPromptClick() {
        viewModelScope.launch {
            promptRepository.save()
        }
    }
}