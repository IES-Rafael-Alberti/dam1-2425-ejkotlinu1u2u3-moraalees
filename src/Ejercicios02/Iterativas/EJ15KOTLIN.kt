package com.dam1.ejerciciosbasicos.Ejercicios02.Iterativas

fun comprobarEntero(numero: String): Boolean {
    return numero.toIntOrNull() != null
}

fun sumatorioNumeros(numeroInicial: String) {
    var sumatorio = 0
    var numero = numeroInicial

    while (numero != "0" && comprobarEntero(numero)) {
        val numeroInt = numero.toInt()
        sumatorio += numeroInt
        print("Siga escribiendo (Si desea parar la suma escriba 0): ")
        numero = readLine()?.trim() ?: ""
    }

    if (numero == "0") {
        println("El sumatorio es: $sumatorio")
    } else {
        println("Solo se valían números enteros positivos...")
    }
}

fun main() {
    print("Escriba un número entero positivo: ")
    var numero = readLine()?.trim() ?: ""

    while (!comprobarEntero(numero)) {
        print("Si escribes un número entero positivo mejor, anda inténtalo: ")
        numero = readLine()?.trim() ?: ""
    }

    sumatorioNumeros(numero)
}
