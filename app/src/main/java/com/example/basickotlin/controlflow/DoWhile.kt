package com.example.basickotlin.controlflow

fun main() {
    print("Dzikir apa hari ini? ")
    val dzikir : String = readLine()!!.toString()
    print("Berapa kali? ")
    val jumlah : Int = readLine()!!.toInt()
    var i = 1
    do {
        println(dzikir)
        Thread.sleep(100)
        i++
    }while (i <= jumlah)
    println("Masyaallah kamu sudah berdzikir sebanyak $jumlah kali hari ini")
}