package com.uguraltintas.periodictable

data class Element(
    val name: String,
    val symbol: String,
    val number: Int,
    val period: Int,
    val imgUrl: String,
    val visibility : Boolean = true,
    val backgroundColor : String = "#FFFFB4"
)
