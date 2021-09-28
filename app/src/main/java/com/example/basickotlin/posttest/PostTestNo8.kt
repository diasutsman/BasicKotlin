package com.example.basickotlin.posttest

data class PemainBola(val name : String, val umur : Int )

fun main() {
    val persija = PemainBola("Riko Simajuntak", 28)
    println(persija)
}