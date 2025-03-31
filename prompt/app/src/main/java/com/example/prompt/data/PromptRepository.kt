package com.example.prompt.data

import com.example.prompt.data.models.Prompt
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.tasks.await

class PromptRepository {
    val db = Firebase.firestore

    suspend fun save() {
        // Create a new user with a first and last name. Here Firestore will create a DocumentId but we dont need to add it when creating an object
        val studentPrompt = Prompt("gpt4-o", "Help me expalin this error:asdsda")

        // Add a new document with a generated ID
        db
            .collection("prompt")
            .add(studentPrompt)
            .await()
    }
}