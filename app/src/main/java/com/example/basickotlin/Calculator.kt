package com.example.basickotlin

class Calculator {
    var a : Double = 0.0
    var b : Double = 0.0
    var op : Char = '0'
    fun display() {
        println("Calculator\n")
        print("angka pertama: ")
        a = readLine()!!.toDouble()

        print("operator (+, -, /, *, %): ")
        op = readLine()!!.toCharArray()[0]

        print("angka kedua: ")
        b = readLine()!!.toDouble()
    }

    fun calculate() {
        when(op) {
            '+' -> println(a+b)
            '-' -> println(a-b)
            '/' -> println(a/b)
            '*' -> println(a*b)
            '%' -> println(a%b)
            else -> println("Error: unknown operator")
        }
    }

}

fun main() {
    val myCalc = Calculator()
    myCalc.display()
    myCalc.calculate()
}