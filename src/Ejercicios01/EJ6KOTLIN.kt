package com.dam1.ejerciciosbasicos.Ejercicios01

fun ejecutarEJ6KOTLIN(){
    println("Introduzca el importe final de un artículo:")
    var importe: Double? = readLine()?.toDoubleOrNull()
    while (importe == null || importe < 0) {
        println("Debe introducir un importe válido:")
        importe = readLine()?.toDoubleOrNull()
    }
    val iva_aplicado = importe * 0.1
    val iva_redondo = Math.round(iva_aplicado * 100) / 100.0
    println("El IVA que se aplicó es de $iva_redondo€")

    val importe_sin_iva = importe - iva_aplicado
    val importe_redondo = Math.round(importe_sin_iva * 100) / 100.0
    println("El importe sin IVA es de $importe_redondo€")
}

fun main(){
    ejecutarEJ6KOTLIN()
}