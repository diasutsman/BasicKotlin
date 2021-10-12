package com.example.basickotlin.posttest2

open class IDN(var mata_pelajaran : List<Any> ,
         var jam_pelajaran : List<Any>,
         var pengajar : List<Any>) {
    fun cetak_mp() = println(this.mata_pelajaran)
    fun cetak_jp() = println(this.jam_pelajaran)
    fun cetak_pengajar() = println(this.pengajar)
    fun get_mp() = this.mata_pelajaran
    fun get_jp() = this.jam_pelajaran
    fun get_pengajar() = this.pengajar

    fun login(nama: String, jam_pelajaran: Int) {
        if (this.pengajar.contains(nama) && this.jam_pelajaran.contains(jam_pelajaran)) println("Kamu sudah login!")
        else println("Nama atau Jam Pelajaran tidak valid")
    }
}

class InputData: IDN(listOf("db", "web",  "android", "diniyyah", "adab", "quran hadis", "akhlak", "tahfidz"),
                     listOf(  6 ,     7,         8,          9,     10,            11,       12,    13, 14, 15),
                     listOf("adi", "nugroho", "fusilat", "argo", "sekar", "tanjung", "bunga", "melati", "dea", "aini"))

fun outputData(param : IDN) {
    println("${param.pengajar[1]} mengajar di jam ke ${param.jam_pelajaran[3]} pada mata pelajaran ${param.mata_pelajaran[3]}")
}

fun main() {
    val idn = InputData()
    idn.login("adi", 8)
}