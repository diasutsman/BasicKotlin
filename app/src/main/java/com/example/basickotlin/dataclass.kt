package com.example.basickotlin

class Kelas(var jumlah : Int, var dataSiswa : List<String>) {
    /*menimpa function toString() default dan mengganti dengan logika kita sendiri*/
    override fun toString(): String {
        return "Kelas(jumlah=$jumlah, dataSiswa=$dataSiswa)"
    }
}
data class DataKelas(var jumlah : Int, var dataSiswa : List<String>)


fun main() {
    val kelas = Kelas(20, listOf("Dias", "Garin", "Lukman"))
    val dataKelas = DataKelas(20, listOf("Dias", "Garin", "Lukman"))
    println(kelas)
    println(dataKelas)

    // .copy()
    val dataKelas1 = dataKelas.copy() // copy datanya dan disimpan ke variabel dataKelas1
    println(dataKelas1)

    // .equals()
    println(dataKelas.equals(dataKelas1)) // java jaman dulu
    println(dataKelas == dataKelas1) // kotlin jaman sekarang

    // .componentN()
    // println(dataKelas.component1()) // ambil komponen ke 1
        println(dataKelas.component2()) // ambil komponen ke 2
}