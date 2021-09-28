package com.example.basickotlin.tipedata

fun main() {
//    trimIndent : meratakan kekiri
    val paragraf1 = """
        jsdhjisfhsijhfiudshfudshfisdhfsd
        dsfisdfisgidfgsiugfsdfgsd
        sdhihdsgfsdfohdwufhuhfusdhfudshfuhdshhdsofh\sd
        dfihfuhdufhduhfe9
    """.trimIndent()

    println(paragraf1)

    println()
//    trimMargin : meratakan kekiri jika diberi tanda
//    (default prefixnya "|", tapi bisa diganti tandanya degan menambahkan argument di function trimMargin())
    val paragraf2 = """
        :jsdhjisfhsijhfiudshfudshfisdhfsd
        :dsfisdfisgidfgsiugfsdfgsd
        :sdhihdsgfsdfohdwufhuhfusdhfudshfuhdshhdsofh\sd
        :dfihfuhdufhduhfe9
    """.trimMargin(":")

    println(paragraf2)

    println()
//    menggabungkan dua string
    val fname = "Dias"
    val lname = "Utsman"
    println(fname + " " + lname)

    println()

    //    String template : $variableName jika kompleks ${$variableName.length}
    val nama = "Dias"
    println("nama $nama terdiri dari ${nama.length}")
    println(nama == "Dia")
}