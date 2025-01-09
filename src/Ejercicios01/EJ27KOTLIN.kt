package com.dam1.ejerciciosbasicos.Ejercicios01

fun main() {
    println("Escriba el nombre de su producto: ")
    val nombre = readLine() ?: ""

    println("Escriba el precio de su producto: ")
    val precio = readLine()?.toDoubleOrNull() ?: 0.0

    println("Introduzca ahora un número de unidades: ")
    val num = readLine()?.toIntOrNull() ?: 0

    val total = precio * num

    println("Nombre: $nombre - Precio unitario: ${"%.2f".format(precio).padStart(8)} - Nº unidades: ${"%03d".format(num)} - Coste total: ${"%.2f".format(total).padStart(10)}")
}
