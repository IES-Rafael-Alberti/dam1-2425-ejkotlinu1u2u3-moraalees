package com.dam1.ejerciciosbasicos.Ejercicios02.Excepciones

fun ej8exc(){
    val entrada = pedirNumero3()
    println("El número ingresado es: $entrada")
}

fun pedirNumero3(): Int {
    while (true) {
        try {
            print("Introduzca un número entero positivo: ")
            val numero = readLine()?.toIntOrNull() ?: throw Exception("Debe ingresar un número válido")
            if (numero <= 0) {
                throw Exception("El número debe ser mayor que 0")
            }
            return numero
        } catch (e: Exception) {
            println("La entrada no es correcta: ${e.message}")
        }
    }
}

fun main() {
    ej8exc()
}
