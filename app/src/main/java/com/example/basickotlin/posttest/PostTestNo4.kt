fun main() {
    calculator(1, '+', 1)
    calculator(1, 'a', 1)
}

// TODO 1 Lengkapi fungsi berikut dengan program yang dapat menghitung operator
// penjumlahan +
// pengurangan -
// pembagian /
// perkalian *
// modulus %

fun calculator(a : Int, op : Char, b : Int) {
    // TODO 2 Buat kondisi jika operator yang diinputkan salah
    // maka cetak text berikut sebagai output
    // "Operator tidak dikenali program"
    when (op) {
        '+' -> println("$a $op $b = ${a + b}")
        '-' -> println("$a $op $b = ${a - b}")
        '*' -> println("$a $op $b = ${a * b}")
        '/' -> println("$a $op $b = ${a / b}")
        '%' -> println("$a $op $b = ${a % b}")
        else -> println("Operator tidak dikenali program")
    }
}

// ekspektasi output:
// 1 + 1 = 2
// Operator tidak dikenali program