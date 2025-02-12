package com.example.searching_sorting_bigo

enum class DeviceState { OFF, ON }
enum class Gender { male, FEMALE, OTHER }

fun main() {
//    val empl = Employee("benjamin", "hughes", 2000f);
//    println(empl.salary)
//
//    println(DeviceState.ON)
//
//    Gender.male

    val currentYear = 2025
    val yearOfRelease = 2019
//    val ageOfModel: Int = currentYear - yearOfRelease
//    if (ageOfModel == 1) {
//        println("The current age of the $model is: $ageOfModel year")
//    } else
//        println("The current age of the $model is: $ageOfModel years")
//    }

//    val ageOfModel = currentYear - yearOfRelease
//    println("The current age of the $model is: $ageOfModel year${if (ageOfModel == 1) "" else "s"}")
//
    val macbookPro = Laptop("asd", 123, 2025, true);
    macbookPro.displayDetails()
}

//class Employee(private val firstname: String, private val lastname: String, salary: Float) {
//    var salary: Float = salary
//        set(value) {
//            field = if (value < 0) 0.0f else value // Prevents negative salary
//        }
//    init {
//        if (salary < 0.0) this.salary = 0.0f
//    }
//}

open class Computer(model: String, serialNumber: Long, yearOfRelease: Int) {
    open fun displayAgeOfModel() {
        println("displayAgeOfModel")
    }

    open fun displayDetails() {
        println("displayDetails")
    }
}

class Laptop(model: String, serialNumber: Long, yearOfRelease: Int, var bluetoothStatus: Boolean): Computer(model, serialNumber, yearOfRelease) {
//    override fun displayAgeOfModel() {
//        println("asdsd")
//    }
//
    override fun displayDetails() {
        println("hey hey")
    }

    fun isBluetoothOn() {
        println("Is Bluetooth on: $bluetoothStatus")
    }
}