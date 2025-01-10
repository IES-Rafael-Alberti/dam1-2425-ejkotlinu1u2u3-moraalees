package com.dam1.ejerciciosbasicos.Ejercicios03.Conjuntos

fun limpiarTerminal5() {
    repeat(10) { println() }
}

fun pausa5() {
    Thread.sleep(2000)
}

fun mostrarResultados(consonantes: Set<Char>, comunes: Set<Char>) {
    println("Conjunto de consonantes: $consonantes")
    pausa5()
    println("Conjunto de letras comunes entre vocales y consonantes: $comunes")
}

fun main() {
    limpiarTerminal5()

    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    val alfabeto = ('a'..'z').toSet()

    val consonantes = (alfabeto - vocales)

    val letrasComunes = vocales intersect consonantes

    mostrarResultados(consonantes, letrasComunes)
}