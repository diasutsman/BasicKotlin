package com.example.basickotlin.posttest

fun main() {
    val nilaiMatematika = 88
    val nilaiInggris = 93
    val nilaiSejarah = 75

    predikat(nilaiMatematika)
    predikat(nilaiInggris)
    predikat(nilaiSejarah)
}

fun predikat(nilai: Int) {
    println(
        when(nilai) {
            in 90..100 -> "Predikat A dengan nilai: $nilai"
            in 80..89 -> "Predikat B dengan nilai: $nilai"
            else -> "Predikat C dengan nilai: $nilai"
        }
    )
}
