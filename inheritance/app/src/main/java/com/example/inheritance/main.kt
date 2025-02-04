package com.example.inheritance

fun main() {
    val samsungTelevision = PhysicalOrder("asd", "samtele", 2000f, "Benjamin Hughes", "langdyss")
    samsungTelevision.processOrder()

    val harryPotterEbbok = DigitalOrder("asd", "harrypot", 200f, "Benjamin Hughes", "benjamin@asd.dk")
    harryPotterEbbok.processOrder()
}