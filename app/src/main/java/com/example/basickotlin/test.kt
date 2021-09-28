package com.example.basickotlin

fun main() {
    val friends = arrayOf("Gharin", "Dias", "Altaf")
    println(friends.toList())
//    ganti teman
    friends[0] = "Aksho"
    println(friends.toList())
}