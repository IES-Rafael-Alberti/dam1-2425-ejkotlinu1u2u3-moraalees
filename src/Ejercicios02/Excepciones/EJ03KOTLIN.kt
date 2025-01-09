package com.dam1.ejerciciosbasicos.Ejercicios02.Excepciones

fun pedirNumero2(): Int {
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

fun cuentaAtras(numero: Int) {
    var cont = numero
    while (cont > 0) {
        for (i in 0 until numero) {
            print("$cont, ")
            cont -= 1
        }
    }
    println("0.")
}

fun main() {
    val numero = pedirNumero2()
    println("La cuenta atrás desde $numero es la siguiente:")
    cuentaAtras(numero)
}
