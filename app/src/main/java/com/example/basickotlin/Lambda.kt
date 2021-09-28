package com.example.basickotlin

fun main() {
    message()
    anotherMessage("jbncueo")
    println("the length of Dias Utsman: ${len("Dias Utsman")}")
}
// contoh lambda
val message = { println("Hello")}

// contoh lambda menggunakan parameter
val anotherMessage = { a : String -> println("Hello $a")}

// contoh lambda dengan return
val len = {string : String -> string.length}
