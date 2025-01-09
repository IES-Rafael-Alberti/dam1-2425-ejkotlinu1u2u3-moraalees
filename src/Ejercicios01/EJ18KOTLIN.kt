package com.dam1.ejerciciosbasicos.Ejercicios01

fun main() {
    println("¿Cuál es tu nombre?")
    var nombre: String = readLine().toString()
    while (nombre.length == 0) {
        println("Venga, pon algo al menos:")
        nombre = readLine().toString()
    }
    val nombre_mayus = nombre.uppercase()
    println("Su nombre en mayúsculas es $nombre_mayus.")

    val nombre_minus = nombre.lowercase()
    println("Su nombre en minúsculas es $nombre_minus.")

    val nombreTransformado = nombre.trim()
        .split(" ")
        .joinToString(" ") { palabra ->
            palabra.lowercase().replaceFirstChar {
                if (it.isLowerCase()) it.titlecase() else it.toString()
            }
        }
    println("Su nombre entonces es $nombreTransformado")
}