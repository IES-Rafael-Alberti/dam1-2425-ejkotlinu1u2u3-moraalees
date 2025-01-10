package com.dam1.ejerciciosbasicos.Ejercicios03.Diccionarios

import java.util.*

fun limpiarTerminal3() {
    repeat(10) { println() }
}

fun pausa3() {
    Thread.sleep(2000)
}

fun pedirPalabras(): MutableMap<String, String> {
    var salir = false
    val diccionario = mutableMapOf<String, String>()
    val scanner = Scanner(System.`in`)

    while (!salir) {
        limpiarTerminal3()
        println("Escriba una palabra y su traducción separadas por -:-  (si desea parar pulse ENTER): ")
        val palabra = scanner.nextLine().trim().lowercase()

        if (palabra.isEmpty() && diccionario.isNotEmpty()) {
            println("Saliendo del programa...")
            pausa3()
            salir = true
        } else if (palabra.isEmpty() && diccionario.isEmpty()) {
            println("Su diccionario está vacío, debe introducir mínimo una traducción...")
            pausa3()
        } else {
            try {
                val (espanol, ingles) = palabra.split(":").map { it.trim() }
                diccionario[espanol] = ingles
                println("Sus palabras fueron añadidas con éxito.")
                pausa3()
            } catch (e: Exception) {
                println("**ERROR** - Error al procesar la palabra. Asegúrese de seguir el formato correcto.")
                pausa3()
            }
        }
    }

    return diccionario
}

fun traducirFrase(diccionario: MutableMap<String, String>, frase: String): String {
    val palabras = frase.split(" ")
    val traduccion = palabras.map { diccionario.getOrDefault(it, it) }
    return traduccion.joinToString(" ")
}

fun main() {
    val traducciones = pedirPalabras()

    val scanner = Scanner(System.`in`)
    println("Ahora escriba una frase para intentar traducirla a base del diccionario creado: ")
    val frase = scanner.nextLine().trim().lowercase()
    val fraseTraducida = traducirFrase(traducciones, frase)

    limpiarTerminal3()
    println("\nFrase traducida:")
    pausa3()
    println(fraseTraducida)
}