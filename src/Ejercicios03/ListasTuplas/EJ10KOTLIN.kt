package com.dam1.ejerciciosbasicos.Ejercicios03.ListasTuplas

import kotlin.random.Random
import java.util.*

fun ej10litu(){
    limpiarTerminal4()

    val min = 1
    val max = 100
    val scanner = Scanner(System.`in`)

    print("Escriba la cantidad de precios que quiere que haya en la lista (2-10): ")
    var longitud = scanner.nextLine()

    while (!comprobarLen(longitud)) {
        print("El rango debe estar entre 2 y 10...: ")
        longitud = scanner.nextLine()
    }

    val cantidad = longitud.toInt()

    val precios = generarLista(min, max, cantidad)
    val preciosOrdenados = ordenarLista(precios)

    mostrarLista(preciosOrdenados)
    menorYMayor(preciosOrdenados)
}

fun limpiarTerminal4() {
    repeat(10) { println() }
}

fun pausa4() {
    Thread.sleep(2000)
}

fun comprobarLen(numero: String): Boolean {
    return numero.toIntOrNull()?.let { it in 2..10 } ?: false
}

fun recibirRandom(min: Int, max: Int): Int {
    return Random.nextInt(min, max + 1)
}

fun generarLista(min: Int, max: Int, numElementos: Int): List<Int> {
    val lista = mutableListOf<Int>()
    repeat(numElementos) {
        lista.add(recibirRandom(min, max))
    }
    return lista
}

fun ordenarLista(lista: List<Int>): List<Int> {
    return lista.sorted()
}

fun mostrarLista(lista: List<Int>) {
    limpiarTerminal4()
    println("La lista generada de menor a mayor es la siguiente:")
    pausa4()
    println(lista)
    pausa4()
}

fun menorYMayor(lista: List<Int>) {
    println("El número más pequeño de la lista es: ${lista.first()}")
    println("El número más grande de la lista es: ${lista.last()}")
}

fun main() {
    ej10litu()
}