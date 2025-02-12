package com.example.inheritance

fun main() {
    val fido: Dog = Dog("Fido", 4)
    fido.createdDate = "asd"
    fido.saySound()

    var animal1 = Animal("asd", 4)

    val ageOfModel = 0
    println("The current age of the is: $ageOfModel year${if (ageOfModel != 1) "s" else ""}")
}

open class Animal(var name: String, var nrOfLegs: Int) {
    var createdDate: String = "5/2-2025"
}

class Dog(name: String, nrOfLegs: Int): Animal(name, nrOfLegs) {
    fun saySound() {
        // Super refererer til klassen der bliver nedarvet fra
        println(super.createdDate)
        println("${this.createdDate} says woof")
        super.createdDate = "asd";

    }
}

//
//class BankAccount(balance: Int, birthYear: Int) {
//    private var balance: Int = balance
//        get() {
//            return 2
//        }
//        set(value) {
//            field = value
//        }
//
//    val age: Int
//        get() {
//            return birthYear
//        }
//}
//
//class Person(_name: String) {
//    val name: String
//        get() {
//           return _name
//        }   // More readable
//}
