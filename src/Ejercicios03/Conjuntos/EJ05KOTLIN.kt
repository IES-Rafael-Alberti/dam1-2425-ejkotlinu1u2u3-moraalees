package com.dam1.ejerciciosbasicos.Ejercicios03.Conjuntos

fun limpiarTerminal4() {
    repeat(10) { println() }
}

fun pausa4() {
    Thread.sleep(2000)
}

fun numerosPares(numeros: Set<Int>): Set<Int> {
    return numeros.filter { it % 2 == 0 }.toSet()
}

fun multiplosTres(numeros: Set<Int>): Set<Int> {
    return numeros.filter { it % 3 == 0 }.toSet()
}

fun mostrarResultados(pares: Set<Int>, multiplos: Set<Int>, combinacion: Set<Int>) {
    println("Conjunto de números pares: $pares")
    pausa4()
    println("Conjunto de números múltiplos de tres: $multiplos")
    pausa4()
    println("Números que son pares y múltiplos de tres: $combinacion")
}

fun main() {
    limpiarTerminal4()

    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = numerosPares(numeros)
    val multiplosDeTres = multiplosTres(numeros)
    val paresYMultiplosDeTres = pares intersect multiplosDeTres

    mostrarResultados(pares, multiplosDeTres, paresYMultiplosDeTres)
}