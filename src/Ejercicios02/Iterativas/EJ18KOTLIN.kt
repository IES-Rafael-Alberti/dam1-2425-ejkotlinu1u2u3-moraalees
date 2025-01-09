package com.dam1.ejerciciosbasicos.Ejercicios02.Iterativas

fun dividirSumarNumeroPar() {
    var contadorPares = 0

    while (true) {
        print("Escriba un número entero positivo (Si desea salir del programa escriba -1): ")
        val numero = readLine()?.trim() ?: ""

        if (numero == "-1") {
            break
        }

        if (numero.toIntOrNull() == null || numero.toInt() < 0) {
            println("Te dije que solo se podían escribir números enteros positivos...")
            continue
        }

        val sumatorio = numero.map { it.digitToInt() }.sum()
        println("La suma de todos los números en $numero es $sumatorio.")

        if (numero.toInt() % 2 == 0) {
            contadorPares++
        }
    }

    println("Escribiste $contadorPares número/s par/es.")
}

fun main() {
    dividirSumarNumeroPar()
}
