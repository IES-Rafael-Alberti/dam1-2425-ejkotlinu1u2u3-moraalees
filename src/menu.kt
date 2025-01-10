package com.dam1.ejerciciosbasicos
import com.dam1.ejerciciosbasicos.Ejercicios01.*
import com.dam1.ejerciciosbasicos.Ejercicios02.*
import com.dam1.ejerciciosbasicos.Ejercicios03.*

fun limpiarTerminal() {
    repeat(10) { println() }
}

fun pausa() {
    Thread.sleep(3000)
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
    println("== MENÚ EJERCICIOS 1 ==")
    println()
    println("1. Ejercicio 4")
    println("2. Ejercicio 6")
    println("3. Ejercicio 12")
    println("4. Ejercicio 15")
    println("5. Ejercicio 18")
    println("6. Ejercicio 22")
    println("7. Ejercicio 24")
    println("8. Ejercicio 25")
    println("9. Ejercicio 26")
    println("10. Ejercicio 27")
    println("X. Volver")
}

fun menuEj2() {

}

fun menuEj3() {

}


fun main() {
    var menu = true
    while (menu){
        limpiarTerminal()
        menuEjercicios()

        val entrada = readLine()?.toIntOrNull()

        if (entrada == 1){
            limpiarTerminal()
            menuEj1()
            var salirEj1 = true
            while (salirEj1){
                val ej01: String? = readLine()
                if (ej01 == "1"){
                    limpiarTerminal()
                    ejecutarEJ4KOTLIN()
                    salirEj1 = false
                    pausa()
                } else if (ej01 == "2"){
                    limpiarTerminal()
                    ejecutarEJ6KOTLIN()
                    salirEj1 = false
                    pausa()
                } else if (ej01 == "3"){
                    limpiarTerminal()
                    ejecutarEJ12KOTLIN()
                    salirEj1 = false
                    pausa()
                } else if (ej01 == "4"){
                    limpiarTerminal()
                    ejecutarEJ15KOTLIN()
                    salirEj1 = false
                    pausa()
                } else if (ej01 == "5"){
                    limpiarTerminal()
                    ejecutarEJ18KOTLIN()
                    salirEj1 = false
                    pausa()
                } else if (ej01 == "6"){
                    limpiarTerminal()
                    ejecutarEJ22KOTLIN()
                    salirEj1 = false
                    pausa()
                } else if (ej01 == "7"){
                    limpiarTerminal()
                    ejecutarEJ24KOTLIN()
                    salirEj1 = false
                    pausa()
                } else if (ej01 == "8"){
                    limpiarTerminal()
                    ejecutarEJ25KOTLIN()
                    salirEj1 = false
                    pausa()
                } else if (ej01 == "9"){
                    limpiarTerminal()
                    ejecutarEJ26KOTLIN()
                    salirEj1 = false
                    pausa()
                } else if (ej01 == "10"){
                    limpiarTerminal()
                    ejecutarEJ27KOTLIN()
                    salirEj1 = false
                    pausa()
                }else if (ej01 == "X") {
                    println("Saliendo...")
                    pausa()
                    salirEj1 = false
                } else {
                    println("Entrada inválida.")
                    pausa()
                }
            }

        } else if (entrada == 2){
            limpiarTerminal()
            menuEj2()

        } else if (entrada == 3){
            limpiarTerminal()
            menuEj3()

        } else if (entrada == 4){
            menu = false

        } else{
            println("Entrada inválida, debe escoger entre 1-4.")
            pausa()
        }
    }
    limpiarTerminal()
    println("Bye, bye.")
}