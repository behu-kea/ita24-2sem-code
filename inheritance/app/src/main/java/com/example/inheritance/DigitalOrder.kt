package com.example.inheritance

class DigitalOrder (orderId: String, productName: String, price: Float, customerName: String, var email: String): Order(orderId, productName, price) {
    override fun processOrder() {
        println("We are sending your order to this email: $email")
    }
}


