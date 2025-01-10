package com.dam1.ejerciciosbasicos.Ejercicios03.ListasTuplas

import java.util.*

fun ej8litu(){
    limpiarTerminal2()
    val scanner = Scanner(System.`in`)

    print("Escriba una palabra: ")
    val palabra = scanner.nextLine().lowercase().trim()

    println("Comprobando palabra: $palabra")
    pausa2()

    mostrarResultados(palabra)
}

fun limpiarTerminal2() {
    repeat(10) { println() }
}

fun pausa2() {
    Thread.sleep(2000)
}

fun comprobarPalindromo(palabra: String): Boolean {
    return palabra == palabra.reversed()
}

fun mostrarResultados(palabra: String) {
    limpiarTerminal2()
    when {
        comprobarPalindromo(palabra) && palabra.length > 1 -> {
            println("Muy bien, -$palabra- es palíndromo.")
        }
        palabra.length == 1 -> {
            println("Como no va a ser palíndromo -$palabra-, si solo es un caracter...")
        }
        else -> {
            println("Pues no, -$palabra- no es palíndromo, mala suerte...")
        }
    }
}

fun main() {
    ej8litu()
}
