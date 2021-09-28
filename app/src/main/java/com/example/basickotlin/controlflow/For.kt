package com.example.basickotlin.controlflow

fun main() {
//    for (i in 'Z' downTo 'A') {
//        println(i)
//    }
    val name = "Dias"
    for (name in name) {
        println(name)
    }

    (9..50).forEachIndexed { index, i -> println("$index $i") }

}