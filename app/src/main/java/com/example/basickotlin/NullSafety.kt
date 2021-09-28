package com.example.basickotlin

fun main() {
//    1. membuat null dan melakukan pengecakan dengan if else

//    var a : String? = null
//    a = "1"
//    if (a != null) {
//        println(a)
//    }else {
//        println("a is null")
//    }

//  2. tambahin null safety operator
//    val c : String? = null
//    println(c!!.length)
//  3. elvis operator
    print("Your name: ")

//    val name : String? = readLine()
////    val f1 = if (d != null) d.length else -1
////    println(f1)
//    val nameLength = name?.length ?: -1 // d == null? -1 : name.length (klo ada ternary op di kotlin)
//    println(nameLength)

//   !! operator (operator nyolot)
    val iniNull:String? = null
    println(iniNull!!.length) // kena NPE krn memang add
}