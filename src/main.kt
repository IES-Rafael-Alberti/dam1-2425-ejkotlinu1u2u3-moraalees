package com.dam1.ejerciciosbasicos
import com.dam1.ejerciciosbasicos.Ejercicios01.*
import com.dam1.ejerciciosbasicos.Ejercicios02.*
import com.dam1.ejerciciosbasicos.Ejercicios03.*

fun limpiarTerminal() {
    repeat(10) { println() }
}

fun pausa() {
    Thread.sleep(2000)
}

fun menuEjercicios() {
    println("== MENÚ PRINCIPAL ==")
    println()
    println("1. Ejercicios 01")
    println("2. Ejercicios 02")
    println("3. Ejercicios 03")
    println("4. Salir")
}

fun menuEj1() {

}

fun main() {
    var menu = true
    while (menu)
        limpiarTerminal()
        menuEjercicios()
        var entrada: Int = readLine()?.toIntOrNull()
        if (entrada == 1)
            menuEj1()
}