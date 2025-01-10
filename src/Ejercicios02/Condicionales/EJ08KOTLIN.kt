package com.dam1.ejerciciosbasicos.Ejercicios02.Condicionales

fun ej8cond(){
    println("Introduzca su puntuación en la empresa (0.0, 0.4 o 0.6-...): ")
    var puntuacion = readLine()?.toDoubleOrNull() ?: -1.0

    while (!comprobarPuntuacion(puntuacion)) {
        println("Eso no puede ser una puntuación.")
        println("Introduzca su puntuación en la empresa (0.0, 0.4 o 0.6-... ¿Sabes leer?): ")
        puntuacion = readLine()?.toDoubleOrNull() ?: -1.0
    }

    nivelRendimiento(puntuacion)
}

fun comprobarPuntuacion(puntuacion: Double): Boolean {
    return puntuacion == 0.0 || puntuacion == 0.4 || puntuacion >= 0.6
}

fun nivelRendimiento(puntuacion: Double) {
    when {
        puntuacion == 0.0 -> println("No tienes puntos, por tanto tu premio es de ${puntuacion * 2400} euros.")
        puntuacion == 0.4 -> println("Tus puntos son suficientes para el premio de ${puntuacion * 2400}€.")
        puntuacion >= 0.6 -> println("Tienes muchos puntos, por tanto tendrás ${puntuacion * 2400}€.")
    }
}

fun main() {
    ej8cond()
}
