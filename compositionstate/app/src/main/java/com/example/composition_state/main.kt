package com.example.composition_state

class Student(val name: String) {
    val grades: MutableList<Int> = mutableListOf(2)
}

fun main() {
    val grades: MutableList<Int> = mutableListOf(10, 7, 12);
    val peter = Student(name = "peter")
    peter.grades.add(10);
}