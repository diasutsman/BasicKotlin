package com.example.basickotlin.controlflow

fun main() {
    val x = 10
    when(x) {
        1 -> println("x = $x")
        2 -> println("x = 2")
        else -> println("x tidak memiliki nilai")
    }
//    when exspression with mulitple option
    val finalScore = 'F'
    when(finalScore) {
        'A', 'B', 'C' -> println("You pass the test")
        else -> println("Don't give up")
    }

//    when expression : in
    val friendsName = arrayOf("Gharin", "Marva", "Nanda")
    val name = "Marva"
    when(name) {
        in friendsName -> println("TEMANKU!!")
        !in friendsName -> println("Anda siapa??")
    }

//    when tanda variable
    print("nilai anda: ")
    val nilaiUjian = readLine()!!.toInt()
    when {
        nilaiUjian >= 90 -> println("Anda pelajar terbaik")
        nilaiUjian >= 80 -> println("Nilai anda cukup")
        else -> println("Bealjar lagi ya....")
    }
}