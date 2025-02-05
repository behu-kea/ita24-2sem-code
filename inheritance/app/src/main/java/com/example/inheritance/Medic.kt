package com.example.inheritance

class Medic(name: String, var numberOfMedkits: Int): Survivor(name) {
    override fun fight() {
        println("Kills two zombies")
    }
}