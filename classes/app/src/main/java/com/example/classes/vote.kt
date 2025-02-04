package com.example.classes

fun main() {
    println("Enter your age: ")
    val age = readln().toInt()

    val canVote = isEligibleToVote(age);
    println(canVote)
    /*
    val doesNumberHave10Cahrtters = number.length == 10;
    val firstTwoCharlessThan31 = number.substring(0,2).toInt() <= 31
    if (doesNumberHave10Cahrtters && firstTwoCharlessThan31) {



    }

     */
}

fun isEligibleToVote(age: Int): Boolean {
   return age >= 18
}