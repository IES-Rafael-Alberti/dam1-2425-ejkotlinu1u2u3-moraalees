package com.dam1.ejerciciosbasicos.Ejercicios03.Conjuntos

fun ej3conj(){
    limpiarTerminal2()

    val conjunto = setOf(6, 1, 4)

    val resultado = conjuntoPotencia(conjunto)
    println("Conjunto potencia de $conjunto es el siguiente:")
    pausa2()

    for (subconjunto in resultado) {
        println(subconjunto)
    }
}

fun limpiarTerminal2() {
    repeat(10) { println() }
}

fun pausa2() {
    Thread.sleep(2000)
}


fun conjuntoPotencia(conjuntoOriginal: Set<Int>): List<Set<Int>> {
    val potencia = mutableListOf<Set<Int>>(emptySet())

    for (elemento in conjuntoOriginal) {
        val nuevosConjuntos = mutableListOf<Set<Int>>()

        for (subconjunto in potencia) {
            nuevosConjuntos.add(subconjunto + elemento)
        }

        potencia.addAll(nuevosConjuntos)
    }

    return potencia
}

fun main() {
    ej3conj()
}