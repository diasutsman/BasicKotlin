package com.example.basickotlin.basic

fun main() {
//    literal constant
    val decimal = 69
    val hexadecimal = 0x45
    val binary = 0b1000101
    println("dec: $decimal")
    println("hex: $hexadecimal")
    println("bin: $binary")
//    underscore
    val biayaMasuk = 30_000_000
    println("biaya masuk: $biayaMasuk")

//    conversion float
    val float : Float = biayaMasuk.toFloat()
    println(float)
    val lst = listOf("1","2", " 3")
    println(lst.toString())
}
