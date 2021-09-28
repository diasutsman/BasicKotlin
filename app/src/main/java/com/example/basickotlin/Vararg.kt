package com.example.basickotlin

import java.util.*


fun main() {
    val arr = intArrayOf(1, 2, 3 ,4 ,5 ,4 ,3 ,2 ,1 ,3 ,4)
    println(sum(*arr))
}

fun sum(vararg input : Int) = input.sum()
