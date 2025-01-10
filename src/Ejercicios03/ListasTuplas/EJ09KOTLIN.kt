package com.dam1.ejerciciosbasicos.Ejercicios03.ListasTuplas

import java.util.*

fun limpiarTerminal3() {
    repeat(10) { println() }
}

fun pausa3() {
    Thread.sleep(2000)
}

fun contarVocal(palabra: String) {
    var contadorA = 0
    var contadorE = 0
    var contadorI = 0
    var contadorO = 0
    var contadorU = 0

    for (caracter in palabra) {
        when (caracter) {
            'a' -> contadorA++
            'e' -> contadorE++
            'i' -> contadorI++
            'o' -> contadorO++
            'u' -> contadorU++
        }
    }

    println("La vocal -a- aparece en -$palabra- $contadorA vez/veces.")
    pausa3()
    println("La vocal -e- aparece en -$palabra- $contadorE vez/veces.")
    pausa3()
    println("La vocal -i- aparece en -$palabra- $contadorI vez/veces.")
    pausa3()
    println("La vocal -o- aparece en -$palabra- $contadorO vez/veces.")
    pausa3()
    println("La vocal -u- aparece en -$palabra- $contadorU vez/veces.")
    pausa3()

    val totalVocales = contadorA + contadorE + contadorI + contadorO + contadorU
    println("Por tanto, en -$palabra- hay $totalVocales vocal/es.")
}

// Función principal
fun main() {
    limpiarTerminal3()

    val scanner = Scanner(System.`in`)
    print("Escriba una palabra: ")
    val palabra = scanner.nextLine().lowercase().trim()

    limpiarTerminal3()

    contarVocal(palabra)
}