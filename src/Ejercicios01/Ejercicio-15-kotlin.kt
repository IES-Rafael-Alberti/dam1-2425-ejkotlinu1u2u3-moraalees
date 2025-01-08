package com.dam1.ejerciciosbasicos.Ejercicios01

fun main() {
    println("Introduzca la cantidad de ahorros en su cuenta:")
    val interes = 0.04
    var ahorros: Double? = readLine()?.toDoubleOrNull()
    while (ahorros == null || ahorros < 0){
        println("Introduzca una cantidad válida:")
        ahorros = readLine()?.toDoubleOrNull()
    }
    val año1 = ahorros * (1 + interes)
    val año1_redondo = Math.round(año1 * 100) / 100.0
    println("EL capital tras un año será de $año1_redondo€")

    val año2 = año1 * (1 + interes)
    val año2_redondo = Math.round(año2 * 100) / 100.0
    println("EL capital tras un año será de $año2_redondo€")

    val año3 = año2 * (1 + interes)
    val año3_redondo = Math.round(año3 * 100) / 100.0
    println("EL capital tras un año será de $año3_redondo€")
}