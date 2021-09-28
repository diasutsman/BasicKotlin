package com.example.basickotlin.controlflow

fun main() {
    print("Masukkan jumlah uang parkiran anda ($): ")
    var hours = readLine()!!.toInt()
    hours = Math.max(hours,0)
    println("Total parkiran anda adalah: \$${hours/24 * 15 + (if(hours >= 24) 0 else Math.min(hours,5)) + Math.max(hours%24 - if(hours > 24) 0 else 5,0) * 0.5}")
    // hours / 24 * 15
    // +
    // if hours >= 24
    // then 0
    // else
    // then min(hours, 5)
    // +
    // max(hours%24 -
    // if hours > 24
    // then 0
    // else
    // then 5,
    // 0)
    // * 0.5
}