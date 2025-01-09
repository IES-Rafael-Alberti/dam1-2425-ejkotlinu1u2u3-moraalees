package com.dam1.ejerciciosbasicos.Ejercicios01

fun main(){
    println("Introduzca un nº de Grados Celsius:")
    var celsius: Double? = readLine()?.toDoubleOrNull()
    while (celsius == null) {
        println("Introduzca un dato válido.")
        celsius = readLine()?.toDoubleOrNull()
    }
    val fahrenheit: Double = (celsius * 9 / 5) + 32
    val fahrenheit_redondo = Math.round(fahrenheit * 100) / 100.0
    println("$celsius grados Celsius son exactamente $fahrenheit_redondo grados Fahrenheit")
}