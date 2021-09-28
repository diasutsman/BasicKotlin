package com.example.basickotlin.posttest

data class Person(val name: String, val age: Int, val country: String)

fun main() {
    val people = arrayOf(
        Person("Michael", 20, "USA"),
        Person("Hygra", 22, "Cambodia"),
        Person("Slovoski", 21, "Rusia"),
        Person("Mohamad", 19, "Indonesia")
    )
    println("a.\tCetak semua data di kolom Umur!")
    for (person in people)println(person.age)
    println("b.\tCetak nama yang umurnya >20!")
    for (person in people)if(person.age > 20) println(person.name)
}