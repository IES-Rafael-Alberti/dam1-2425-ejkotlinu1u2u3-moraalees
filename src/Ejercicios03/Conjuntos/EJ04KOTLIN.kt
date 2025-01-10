package com.dam1.ejerciciosbasicos.Ejercicios03.Conjuntos

fun limpiarTerminal3() {
    repeat(10) { println() }
}

fun pausa3() {
    Thread.sleep(2000)
}

fun frutasComunes(frutas1: Set<String>, frutas2: Set<String>) {
    val frutasComunes = frutas1 intersect frutas2
    println("Frutas comunes en ambas listas: $frutasComunes")
    pausa3()
}

fun frutasEn1(frutas1: Set<String>, frutas2: Set<String>) {
    val soloEnFrutas1 = frutas1 subtract frutas2
    println("Frutas solo en frutas1: $soloEnFrutas1")
    pausa3()
}

fun frutasEn2(frutas1: Set<String>, frutas2: Set<String>) {
    val soloEnFrutas2 = frutas2 subtract frutas1
    println("Frutas solo en frutas2: $soloEnFrutas2")
    pausa3()
}

fun main() {
    limpiarTerminal3()

    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")

    val setFrutas1 = frutas1.toSet()
    val setFrutas2 = frutas2.toSet()

    frutasComunes(setFrutas1, setFrutas2)
    frutasEn1(setFrutas1, setFrutas2)
    frutasEn2(setFrutas1, setFrutas2)
}