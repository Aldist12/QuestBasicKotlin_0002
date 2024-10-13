package com.example.questbasickotlin_0002

// Data Class
// Data class adalah class yang digunakan untuk menyimpan data.
// Data class menyediakan fungsi untuk meng-override fungsi equals(), hashCode(), dan toString().
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val dataClass = DataClass(1, "aldist@gmail.com")
    println(dataClass)
}

// Fungsi Equals
val data2 = DataClass(1, "konah@gmail.com")
println(data == data2) // false

// Fungsi Copy
val data3 = data.copy()
println(data3)

// Fungsi Copy dengan perubahan
val data4 = data.copy(email = "Aldiseptiyanto@gmail.com")
println(data4)
}
