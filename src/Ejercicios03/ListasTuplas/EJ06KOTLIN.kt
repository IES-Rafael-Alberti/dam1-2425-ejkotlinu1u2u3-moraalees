package com.dam1.ejerciciosbasicos.Ejercicios03.ListasTuplas

import java.util.*

fun limpiarTerminal1() {
    repeat(10) { println() }
}

fun pausa1() {
    Thread.sleep(2000)
}

fun comprobarNota(nota: String): Boolean {
    return nota.toIntOrNull()?.let { it in 0..10 } ?: false
}

fun recorrerSuspensos(asignaturas: List<String>): List<String> {
    val scanner = Scanner(System.`in`)
    val suspensos = mutableListOf<String>()

    for (asignatura in asignaturas) {
        var nota: String
        do {
            print("¿Cuánto has sacado en $asignatura?: ")
            nota = scanner.nextLine()
            if (!comprobarNota(nota)) {
                println("Escribe bien lo que has sacado (0-10): ")
            }
        } while (!comprobarNota(nota))

        if (nota.toInt() < 5) {
            suspensos.add(asignatura)
        }
        limpiarTerminal1()
    }
    return suspensos
}

fun mostrarSuspensos(suspensos: List<String>, totalAsignaturas: Int) {
    limpiarTerminal1()
    println("Perfecto, ahora saldrán las asignaturas...")
    pausa1()

    when {
        suspensos.isEmpty() -> println("Aprobaste todo, felicidades.")
        suspensos.size == totalAsignaturas -> println("¡Has suspendido todas las asignaturas! Increíble...")
        else -> {
            suspensos.forEach { println("Debes repetir $it.") }
            if (suspensos.size == 1) {
                println("¡Solo es una, yo confío en ti!")
            } else {
                println("¡Intenta recuperar esas ${suspensos.size} asignaturas!")
            }
        }
    }
}

fun main() {
    limpiarTerminal1()

    val asignaturas = listOf(
        "Matemáticas",
        "Lengua Castellana y Literatura",
        "Física",
        "Química",
        "Biología",
        "Filosofía",
        "Dibujo Técnico"
    )

    val suspensos = recorrerSuspensos(asignaturas)
    mostrarSuspensos(suspensos, asignaturas.size)
}
