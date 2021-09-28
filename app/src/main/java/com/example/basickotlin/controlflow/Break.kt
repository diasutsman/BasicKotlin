package com.example.basickotlin.controlflow

fun main() {
    var sum = 0
    var i = 0
    while (i <= 100) {
        sum += i
        i++
        println(sum)
        if(sum > 1000)break
    }
    println(sum)
}