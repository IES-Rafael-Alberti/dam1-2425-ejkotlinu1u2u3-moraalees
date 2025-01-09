package com.dam1.ejerciciosbasicos.Ejercicios02.Iterativas

fun ecoPalabra() {
    var cadena: String
    do {
        cadena = readLine()?.trim()?.lowercase() ?: ""
        if (cadena != "salir") {
            println("Eco: $cadena")
        }
    } while (cadena != "salir")
}

fun main() {
    println("Escriba lo que quiera: ")
    ecoPalabra()
}
