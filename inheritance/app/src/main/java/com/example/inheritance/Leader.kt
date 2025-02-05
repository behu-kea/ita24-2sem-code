package com.example.inheritance

class Leader(name: String, var bravery: Int): Survivor(name) {
    private var isSecretelyTerrified = true;

    override fun fight() {
        println("Leader heroically kills a zombie")
    }
}