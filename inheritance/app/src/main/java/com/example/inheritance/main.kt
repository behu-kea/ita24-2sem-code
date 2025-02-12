package com.example.inheritance

fun main() {
    val sophie = Leader("Sophie", 60);

    val peter = Medic("Peter", 3);

    val michael = TheGuyWhoAlwaysDiesFirst("Michael", 100)

    val survivors: List<Survivor> = listOf(sophie, peter, michael)

    survivors.forEach { survivor ->
        survivor.fight()
    }

    sophie.toString()

    println(sophie)

    sophie.fight()
    michael.fight()
    peter.fight()

    michael.sayLastWords()

    val obj: Base = Derived()
    obj.showMessage()











}

open class Base {
    open fun showMessage() {
        println("Base Message")
    }
}

class Derived : Base() {
    override fun showMessage() {
        println("Derived Message")
    }
}



class User {
    var name: String = "Guest"
        set(value) {
            field = value.uppercase()
        }
}