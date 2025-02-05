package com.example.inheritance

open class Survivor(private val name: String) {
    open fun fight() {
        println("fighting zombie")
    }

//    override fun toString(): String {
//        return "Survivor(name='$name')"
//    }
}