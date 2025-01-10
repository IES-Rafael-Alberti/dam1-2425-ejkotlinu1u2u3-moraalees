package com.dam1.ejerciciosbasicos.Ejercicios01

fun ejecutarEJ24KOTLIN(){
    println("Escriba un precio de un producto en euros: ")
    val precio = readLine() ?: ""

    try {
        val (euros, centimos) = precio.split(".")
        val centimosRedondeados = centimos.toDoubleOrNull()?.let {
            "%.2f".format(it / 100).split(".")[1]
        } ?: centimos

        println("Lo que ha pagado por ese producto es de $euros€ con $centimosRedondeados céntimos.")
    } catch (e: Exception) {
        println("El precio ingresado no es válido.")
    }
}

fun main() {
    ejecutarEJ24KOTLIN()
}