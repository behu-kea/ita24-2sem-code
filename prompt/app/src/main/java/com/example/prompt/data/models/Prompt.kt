package com.example.prompt.data.models
import com.google.firebase.firestore.DocumentId

data class Prompt (
    val model: String = "",
    val prompt: String = "",
    @DocumentId var documentId: String? = null
)