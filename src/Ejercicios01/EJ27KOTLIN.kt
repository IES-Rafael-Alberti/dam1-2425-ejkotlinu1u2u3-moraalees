package com.dam1.ejerciciosbasicos.Ejercicios01

fun main() {
    print("Escriba el nombre de su producto: ")
    val nombre = readLine() ?: ""

    print("Escriba el precio de su producto: ")
    val precio = readLine()?.toDoubleOrNull() ?: 0.0

    print("Introduzca ahora un número de unidades: ")
    val num = readLine()?.toIntOrNull() ?: 0

    val total = precio * num

    println("Nombre: $nombre - Precio unitario: ${"%.2f".format(precio).padStart(8)} - Nº unidades: ${"%03d".format(num)} - Coste total: ${"%.2f".format(total).padStart(10)}")
}
