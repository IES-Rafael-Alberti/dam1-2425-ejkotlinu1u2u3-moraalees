package com.dam1.ejerciciosbasicos.Ejercicios02.Condicionales

fun comprobarCero(divisor: Double): Boolean {
    return divisor != 0.0
}

fun dividirNumeros(dividendo: Double, divisor: Double): Double {
    return dividendo / divisor
}

fun main() {
    println("Escriba un número como dividendo: ")
    val dividendo = readLine()?.toDoubleOrNull() ?: 0.0

    var divisor: Double
    do {
        println("Ahora escriba un número como divisor: ")
        divisor = readLine()?.toDoubleOrNull() ?: 0.0

        if (!comprobarCero(divisor)) {
            println("*ERROR* - El divisor no puede ser 0...")
        }
    } while (!comprobarCero(divisor))

    println("La división de $dividendo entre $divisor es de %.2f".format(dividirNumeros(dividendo, divisor)))
}