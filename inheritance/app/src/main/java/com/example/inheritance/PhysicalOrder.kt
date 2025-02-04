package com.example.inheritance

class PhysicalOrder (orderId: String, productName: String, price: Float, customerName: String, var shippingAdress: String): Order(orderId, productName, price) {
    override fun processOrder() {
        println("We are sending your order to this adress: $shippingAdress")
    }
}


