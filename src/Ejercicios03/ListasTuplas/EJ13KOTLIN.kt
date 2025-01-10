package com.dam1.ejerciciosbasicos.Ejercicios03.ListasTuplas

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun limpiarTerminal5() {
    repeat(10) { println() }
}

fun pausa5() {
    Thread.sleep(2000)
}

fun introducirNumeros(): List<Int> {
    print("Escribe números enteros separados por comas (el último no necesita coma): ")
    val input = readLine()

    return try {
        input!!.split(",").map { it.trim().toInt() }
    } catch (e: Exception) {
        println("**ERROR** - Probablemente no escribiste números separados por comas...")
        exitProcess(1)
    }
}

fun mostrarLista2(lista: List<Int>) {
    limpiarTerminal5()
    println("Entonces escribiste esta secuencia de números:")
    pausa5()
    println(lista)
    pausa5()
}

fun calcularMedia(numeros: List<Int>): Double {
    return numeros.sum().toDouble() / numeros.size
}

fun mostrarMedia(media: Double) {
    limpiarTerminal5()
    println("Calculando media...")
    pausa5()
    println("La media de todos esos números es de $media.")
    pausa5()
}

fun calcularDesviacion(numeros: List<Int>, media: Double): Double {
    val sumaCuadrados = numeros.sumOf { (it - media) * (it - media) }
    return sqrt(sumaCuadrados / numeros.size)
}

fun mostrarDesviacion(desviacion: Double) {
    limpiarTerminal5()
    println("Calculando la desviación típica...")
    pausa5()
    println("La desviación típica de todos esos números es de $desviacion.")
    pausa5()
}

fun mostrarResultados(lista: List<Int>, media: Double, desviacion: Double) {
    limpiarTerminal5()
    println("Como conclusión sacamos esto:")
    println("Lista de números: $lista")
    println("Media de los números: $media")
    println("Desviación típica de los números: $desviacion")
    pausa5()
    println("¡Gracias por esperar!")
}

fun main() {
    limpiarTerminal5()
    val numeros = introducirNumeros()

    mostrarLista2(numeros)

    val media = calcularMedia(numeros)
    mostrarMedia(media)

    val desviacion = calcularDesviacion(numeros, media)
    mostrarDesviacion(desviacion)

    mostrarResultados(numeros, media, desviacion)
}