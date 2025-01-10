package com.dam1.ejerciciosbasicos
import com.dam1.ejerciciosbasicos.Ejercicios01.*
import com.dam1.ejerciciosbasicos.Ejercicios02.Condicionales.*
import com.dam1.ejerciciosbasicos.Ejercicios02.Excepciones.ej2exc
import com.dam1.ejerciciosbasicos.Ejercicios02.Excepciones.ej3exc
import com.dam1.ejerciciosbasicos.Ejercicios02.Excepciones.ej8exc
import com.dam1.ejerciciosbasicos.Ejercicios02.Iterativas.*
import com.dam1.ejerciciosbasicos.Ejercicios03.*
import com.dam1.ejerciciosbasicos.Ejercicios03.Conjuntos.*
import com.dam1.ejerciciosbasicos.Ejercicios03.Diccionarios.*
import com.dam1.ejerciciosbasicos.Ejercicios03.ListasTuplas.ej10litu
import com.dam1.ejerciciosbasicos.Ejercicios03.ListasTuplas.ej13litu
import com.dam1.ejerciciosbasicos.Ejercicios03.ListasTuplas.ej6litu
import com.dam1.ejerciciosbasicos.Ejercicios03.ListasTuplas.ej8litu

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
    println("== MENÚ EJERCICIOS 2 ==")
    println()
    println("Condicionales:")
    println("1. Ejercicio 2 Condicional")
    println("2. Ejercicio 3 Condicional")
    println("3. Ejercicio 6 Condicional")
    println("4. Ejercicio 8 Condicional")
    println("5. Ejercicio 10 Condicional")
    println()
    println("Excepciones:")
    println("6. Ejercicio 2 Excepción")
    println("7. Ejercicio 3 Excepción")
    println("8. Ejercicio 4 Excepción")
    println()
    println("Iterativas:")
    println("9. Ejercicio 13 Iterativa")
    println("10. Ejercicio 15 Iterativa")
    println("11. Ejercicio 18 Iterativa")
    println("12. Ejercicio 19 Iterativa")
    println("13. Ejercicio 25 Iterativa")
    println()
    println("X. Volver")
}

fun menuEj3() {
    println("== MENÚ EJERCICIOS 3 ==")
    println()
    println("Conjuntos:")
    println("1. Ejercicio 2 Conjunto")
    println("2. Ejercicio 3 Conjunto")
    println("3. Ejercicio 4 Conjunto")
    println("4. Ejercicio 5 Conjunto")
    println("5. Ejercicio 6 Conjunto")
    println()
    println("Diccionarios:")
    println("6. Ejercicio 6 Diccionario")
    println("7. Ejercicio 7 Diccionario")
    println("8. Ejercicio 8 Diccionario")
    println("9. Ejercicio 9 Diccionario")
    println("10. Ejercicio 11 Diccionario")
    println()
    println("Listas y tuplas:")
    println("11. Ejercicio 6 Lista y tupla")
    println("12. Ejercicio 8 Lista y tupla")
    println("13. Ejercicio 9 Lista y tupla")
    println("14. Ejercicio 10 Lista y tupla")
    println("15. Ejercicio 13 Lista y tupla")
    println()
    println("X. Volver")
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
            var salirEj2 = true
            while (salirEj2){
                val ej2: String? = readLine()
                if (ej2 == "1"){
                    limpiarTerminal()
                    ej2cond()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "2") {
                    limpiarTerminal()
                    ej3cond()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "3") {
                    limpiarTerminal()
                    ej6cond()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "4") {
                    limpiarTerminal()
                    ej8cond()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "5") {
                    limpiarTerminal()
                    ej10cond()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "6") {
                    limpiarTerminal()
                    ej2exc()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "7") {
                    limpiarTerminal()
                    ej3exc()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "8") {
                    limpiarTerminal()
                    ej8exc()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "9") {
                    limpiarTerminal()
                    ej13ite()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "10") {
                    limpiarTerminal()
                    ej15ite()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "11") {
                    limpiarTerminal()
                    ej18ite()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "12") {
                    limpiarTerminal()
                    ej19ite()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "13") {
                    limpiarTerminal()
                    ej25ite()
                    salirEj2 = false
                    pausa()
                } else if (ej2 == "X") {
                    salirEj2 = false
                    pausa()
                } else {
                    println("Entrada inválida.")
                    pausa()
                }
            }
        } else if (entrada == 3){
            limpiarTerminal()
            menuEj3()
            var salirEj3 = true
            while (salirEj3){
                val ej2: String? = readLine()
                if (ej2 == "1"){
                    limpiarTerminal()
                    ej2conj()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "2") {
                    limpiarTerminal()
                    ej3conj()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "3") {
                    limpiarTerminal()
                    ej4conj()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "4") {
                    limpiarTerminal()
                    ej5conj()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "5") {
                    limpiarTerminal()
                    ej6conj()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "6") {
                    limpiarTerminal()
                    ej6dic()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "7") {
                    limpiarTerminal()
                    ej7dic()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "8") {
                    limpiarTerminal()
                    ej8dic()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "9") {
                    limpiarTerminal()
                    ej9dic()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "10") {
                    limpiarTerminal()
                    ej11dic()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "11") {
                    limpiarTerminal()
                    ej6litu()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "12") {
                    limpiarTerminal()
                    ej8litu()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "13") {
                    limpiarTerminal()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "14") {
                    limpiarTerminal()
                    ej10litu()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "15") {
                    limpiarTerminal()
                    ej13litu()
                    salirEj3 = false
                    pausa()
                } else if (ej2 == "X") {
                    salirEj3 = false
                    pausa()
                } else {
                    println("Entrada inválida.")
                    pausa()
                }
            }

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