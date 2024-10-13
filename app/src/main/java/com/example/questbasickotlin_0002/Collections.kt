package com.example.questbasickotlin_0002

// List adalah Kumpulan data yang disusun secara berurutan
// List bersifat ordered, artinya data yang dimasukkan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukka dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan listOf
// List Mutable menggunakan mutableListOf

fun ContohList() {
    println("=== List ===")

    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)