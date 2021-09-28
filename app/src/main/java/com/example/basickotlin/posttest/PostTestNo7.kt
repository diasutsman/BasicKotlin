package com.example.basickotlin.posttest

fun main() {
    val array = arrayOf(
        "2021/2022",
        "Ajaran",
        "Bidang",
        "Tahun",
        "RPL",
        "Boarding School",
        "Android",
        "IDN",
        "Developer",
        "SMK",
    )

    // hasil
    for (i in array.size-1 downTo 0 step 2) print(array[i] + " ")
    for (i in array.indices step 2) print(array[i] + " ")
}