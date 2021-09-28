package com.example.basickotlin.controlflow

fun main() {
    val nilaiUjian = readLine()!!.toInt()
    if(nilaiUjian >= 90) {
        println("Anda mendapatkan A+")
    }else if (nilaiUjian >= 80) {
        println("Anda mendapatkan A-")
    }else {
        println("Anda bodoh")
    }
}