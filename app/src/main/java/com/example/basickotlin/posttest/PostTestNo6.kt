package com.example.basickotlin.posttest

fun main() {
    for (i in 1..20)print(if (i % 2 == 1 && i % 3 != 0) "\"idn\"" else ", $i")
}