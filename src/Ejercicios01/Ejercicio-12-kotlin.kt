package com.dam1.ejerciciosbasicos.Ejercicios01

fun main() {
    println("Introduzca su peso en kgs:")
    var peso: Double? = readLine()?.toDoubleOrNull()
    while (peso == null || peso < 0) {
        println("Introduzca su peso verdadero...:")
        peso = readLine()?.toDoubleOrNull()
    }
    println("Ahora introduzca su estatura en metros:")
    var estatura: Double? = readLine()?.toDoubleOrNull()
    while (estatura == null || estatura < 0 || estatura > 2.99) {
        println("Introduzca su estatura real...:")
        estatura = readLine()?.toDoubleOrNull()
    }
    val indice = peso / (estatura * estatura)
    val indice_redondo = Math.round(indice * 100) / 100.0
    println("Tu índice de masa corporal es: $indice_redondo")
}