package com.dam1.ejerciciosbasicos.Ejercicios02.Iterativas

fun contador(frase: String): String {
    val palabras = frase.split(" ")

    var palabraMasLarga = ""

    for (palabra in palabras) {
        if (palabra.length > palabraMasLarga.length) {
            palabraMasLarga = palabra
        }
    }

    val cantidadPalabras = palabras.size

    println("La palabra más larga es $palabraMasLarga.")
    println("Has escrito $cantidadPalabras palabra/s.")

    return palabraMasLarga
}

fun main() {
    print("Por favor, ingresa una frase: ")
    val frase = readLine() ?: ""

    contador(frase)
}
