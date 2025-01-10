package com.dam1.ejerciciosbasicos.Ejercicios01

fun ejecutarEJ22KOTLIN(){
    println("Escriba una frase: ")
    val frase = readLine() ?: ""

    println("Ahora escriba una vocal: ")
    val vocal = readLine()?.lowercase() ?: ""

    if (vocal != "a" && vocal != "e" && vocal != "i" && vocal != "o" && vocal != "u") {
        println("Eso no es una vocal.")
    } else {
        println("$frase ${vocal.uppercase()}")
    }
}

fun main() {
    ejecutarEJ22KOTLIN()
}