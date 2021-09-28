package com.example.basickotlin.collection

fun main() {
    // set
    val set1 = setOf(1,2,1,3,2,3,1,2,4,3,5)
    println(set1)

    val set2 = setOf(1,2,3)
    val set3 = setOf(1,2,3,1,3,5)
    println(set2 == set3)

    val setA = setOf(1,5,7,8,9,3)
    val setB = setOf(1,5,7)
    println(setA.union(setB)) // gabungan
    println(setA.intersect(setB)) // irisan

//    immutable set
    val imSetA = mutableSetOf(12,3,43,4,5,3,4)
    imSetA.add(3)
    imSetA.remove(4)
    println(imSetA)

//    map
    val capAndCountry = mapOf("jakarta" to "Indonesia", "Washington" to "Amerika", "Tokyo" to "Jepang")
    println(capAndCountry["Tokyo"])
    println(capAndCountry.getValue("jakarta"))

    // get all keys and values
    println("all capAndCountry's keys: ${capAndCountry.keys}")
    println("all capAndCountry's values: ${capAndCountry.values}")

    // put new key-value pairs into capAndCountry
    val capAndCountry1 = capAndCountry.toMutableMap()
    capAndCountry1.put("London", "UK")
    capAndCountry1.replace("jakarta","Arab")
    println(capAndCountry1)
}

