package com.example.functions

fun main() {
    val name: String = "Benjamin"

    val result = stringTransformer(name, {string ->
        string + " :)";
    });

    println(result)

    // stringTransformer(name, ::transformer);

    val result2 = stringTransformer(name, {string ->
        string[0].toString();
    });

    println(result2)

    val result3 = stringTransformer(name) {string ->
        string[0].toString();
    };

    println(result3)

    val numbers: List<Int> = listOf(10,2,3,4,5);

    val transformedArray = mapper(numbers);
    println(transformedArray)
}

fun mapper(list: List<Int>): List<Int> {
    return list.map{ number ->
        if(number % 2 == 0) {
            number / 2
        } else {
            (number * 3) + 1
        }
    }
}

fun stringTransformer(string: String, stringTransformer: (String) -> String): String {
    val transformedString = stringTransformer(string)

    return transformedString
}

fun transformer(string: String): String {
    return string + "asdsda";
}



