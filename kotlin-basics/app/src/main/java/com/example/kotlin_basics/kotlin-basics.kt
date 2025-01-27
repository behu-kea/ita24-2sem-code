package com.example.kotlin_basics

fun main() {
    val numbers: List<Int> = listOf(1,2,3,4,5);

    //val transformedArray = transformArray(numbers);
    //println(transformedArray)

    numberCypherEncoder("ben");
}

fun numberCypherEncoder(inputString: String): String {
    val alphabet = "abcdefghijklmnopqrstuvxyzæøå";
    var decodedString = ""
    // 1. forloop
    for (i in 0 until inputString.length) {
        //println(i)
        val currentCharacter: Char = inputString.get(i)
        println(currentCharacter);
        val charAlphabeatOrder = alphabet.indexOf(currentCharacter) + 1

        if(i == inputString.length - 1) {
            decodedString = decodedString + charAlphabeatOrder;
        } else {
            decodedString = decodedString + charAlphabeatOrder + ";";
        }
    }

    println(decodedString)
    return ""
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