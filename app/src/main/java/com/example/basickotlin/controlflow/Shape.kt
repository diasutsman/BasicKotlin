package com.example.basickotlin.controlflow

fun main() {
    print("Height = ")
    val height = readLine()!!.toInt()
    for (i in 0 until height) {
        for (j in 0 until height - i - 1) print(" ")
        for (j in 0 until i * 2 + 1) print("*")
        println()
    }
}