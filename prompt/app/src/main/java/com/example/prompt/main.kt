package com.example.prompt

fun main() {
    // https://www.youtube.com/watch?v=hJ9yBgTp9UQ
    val prices = listOf(6.99, 2.99, 7.99, 16.99);

    prices.forEach { price ->
        println(price)
    }

    forEachOwn(prices) { price ->
        println(price)
    }
}

fun forEachOwn(prices: List<Double>, iterateFunction: (Double) -> Unit) {
    for (i in 0..prices.size) {
        iterateFunction(prices[i])
    }
}

