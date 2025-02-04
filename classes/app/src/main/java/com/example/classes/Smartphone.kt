package com.example.classes

class Smartphone(
    val name: String,
    var price: Float,
    val screenSize: Int
) {
    fun callNumber(number: Int) {
        println("$name calling ${number}")
    }

    override fun toString(): String {
        return "Smartphone(name='$name', price=$price, screenSize=$screenSize)"
    }
}
