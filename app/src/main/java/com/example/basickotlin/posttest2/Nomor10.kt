package com.example.basickotlin.posttest2

fun shippingCost(cost: Double, isInternational: Boolean): Double {
    return when {
        isInternational -> Math.min(cost*0.15, 50.0)
        else -> if (cost >= 75) 0.0 else cost*0.10
    }
}

fun main() {
    println(shippingCost(99.8, false))
    println(shippingCost(199.9, true))
}