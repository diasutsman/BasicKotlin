fun main() {
    // todo 1 Solve/selesaikan masalah error dari code berikut
    val text: String? = null
    val angka: Int? = null
    text?.length

    // todo 2 Jika variable di atas null berikan nilai default sehingga
    println(text?: "RPL IDN Boarding School" )  // ekspektasi output "RPL IDN Boarding School"
    println(angka?: 2021) /*ekspektasi output 2021 */
}