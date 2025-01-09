package com.dam1.ejerciciosbasicos.Ejercicios01

fun main() {
    print("Introduzca su fecha de nacimiento (dd/mm/aaaa): ")
    val fecha = readLine() ?: ""
    val (dia, mes, año) = fecha.split("/")
    
    println("El día que usted nació fue el $dia del $mes del $año.")
}