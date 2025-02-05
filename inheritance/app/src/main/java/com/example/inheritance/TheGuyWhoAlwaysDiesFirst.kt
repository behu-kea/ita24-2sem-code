package com.example.inheritance

class TheGuyWhoAlwaysDiesFirst(name: String, val tripChance: Int): Survivor(name) {
    override fun fight() {
        println("Trips and dies")
    }

    fun sayLastWords() {
        print("aaaaaah")
        print("aaaaaah")
    }
}