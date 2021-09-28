package com.example.basickotlin.tipedata

fun main() {
    val identity: Array<Any?> = arrayOf(false, 15, "Dias Utsman")
    println(identity.toList()) //ngeprint dengan ngubah ke list
    for (i in identity) { // ngeprint dengan loop
        println(i)
    }

    println("\nsudah bekerja: ${identity[0]}")
    println("umur         : ${identity[1]}")
    println("nama         : ${identity[2]}")

    identity[1] = 16

    println("\nsudah bekerja: ${identity[0]}")
    println("umur         : ${identity[1]}")
    println("nama         : ${identity[2]}")

/*
jenis - jenis array
• byteArrayOf().
• shortArrayOf().
• intArrayOf().
• longArrayOf().
• charArrayOf().
• booleanArrayOf().
*/
//    membuat array dengan constructot Array(size) dengan memasukkan argument kedalam size sebagai ukuran arraynya dan
//    fungsi dengan hasil return-nya sebagai isinya
    val oneToTen = Array(10) {i -> i+1}
    println(oneToTen.toList())

//    ArrayOfNull
    val nullArray = arrayOfNulls<Int?>(3)
    nullArray[0] = null
    nullArray[1] = null
    nullArray[2] = null
}
