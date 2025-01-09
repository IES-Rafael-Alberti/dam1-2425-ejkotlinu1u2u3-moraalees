package com.dam1.ejerciciosbasicos.Ejercicios02.Condicionales

fun introContrasena(contrasena: String): Boolean {
    val password = "contrasena"
    return password == contrasena.lowercase()
}

fun main() {
    println("Escriba la contraseña: ")
    val contrasena = readLine() ?: ""

    if (introContrasena(contrasena)) {
        println("¡Acertaste la contraseña, felicidades!")
    } else {
        println("Lo siento, no la acertaste...")
    }
}