package com.example.basickotlin.collection

fun main() {
    val numberList = listOf(1,2,3,4,5,6)
    val charList = listOf('a','b','c')
    val anyList = listOf('a', "Kotlin", 3, true)



    println(numberList.listIterator().next())
    println(charList)
    println(anyList)
    println(anyList[3])

    val anyList1 = mutableListOf('a',"Kotlin", 3, true)
    anyList1.add(1)
    println(anyList1)
    anyList1.add(1,2)
    println(anyList1)
    anyList1.removeAt(4)
    println(anyList1)
    var list1 = mutableListOf(1,2)
    var list2 = mutableListOf(3,4)
    println(list1.plus(list2))


}