package com.example.kotlin_basics

fun main() {
    val numbers: List<Int> = listOf(1,2,3,4,5);

    val transformedArray = transformArray(numbers);
    println(transformedArray)

    val str: String = "2"
    val number: Int = 2
    if(str == number) {
        print(1)
    }

}

fun transformArray(array: List<Int>): MutableList<Int> {
    val transformedArray: MutableList<Int> = mutableListOf();
    for (i in 0 until array.size) {
        //println(i)
        val currentNumber = array.get(i);
        if(currentNumber % 2 == 0) {
            transformedArray.add(currentNumber / 2)
        } else {
            transformedArray.add((currentNumber * 3) + 1)
        }
    }

    return transformedArray;
}