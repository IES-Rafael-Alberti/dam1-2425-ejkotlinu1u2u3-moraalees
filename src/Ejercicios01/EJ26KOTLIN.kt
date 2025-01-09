package com.dam1.ejerciciosbasicos.Ejercicios01

fun main() {
    println("Introduzca su compra nombrando artículos separados por comas: ")
    val compra = readLine() ?: ""
    val lista = compra.split(",")
    
    println("Su lista de la compra es:")
    for (articulo in lista) {
        println(articulo.trim())
    }
}