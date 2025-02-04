package com.example.inheritance

open class Order (private val orderId: String, val productName: String, val price: Float) {
    open fun processOrder() {
        println("Sending $productName. OrderId is $orderId")
    }

    fun getDiscountedPrice(): Float {
        return price * 0.8f;
    }
}