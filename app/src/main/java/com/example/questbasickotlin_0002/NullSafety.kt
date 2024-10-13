package com.example.questbasickotlin_0002

fun nullSafety() {
// neverNull has String type
    var neverNull: String = "This can't be null"

// Throws a compiler error
// NeverNull = null

// nullable has nullable String type
    var nullable: String? = "You can keep a null here"
// This is OK
    nullable = null