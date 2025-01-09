package com.dam1.ejerciciosbasicos.Ejercicios02.Excepciones

fun pedirNumero(): Int {
    var numeroIncorrecto = true
    var numero = 0

    while (numeroIncorrecto) {
        try {
            print("Introduzca un número entero positivo: ")
            numero = readLine()?.toIntOrNull() ?: throw Exception("*ERROR* - Debe ingresar un número válido")

            if (numero < 0) {
                throw Exception("*ERROR* - El número debe ser mayor que 0")
            }

            if (numero == 0) {
                throw Exception("*ERROR* - El número no puede ser 0")
            }

            numeroIncorrecto = false
        } catch (e: Exception) {
            println("${e.message}. Inténtelo de nuevo.")
        }
    }
    return numero
}

fun secuenciaImpares(numero: Int) {
    var cont = 1

    while (cont < numero) {
        for (i in 1 until numero step 2) {
            print("$cont, ")
            cont += 2
        }
    }
    println("$numero.")
}

fun main() {
    val numero = pedirNumero()
    println("La secuencia de números impares desde 1 hasta $numero es la siguiente:")
    secuenciaImpares(numero)
}
