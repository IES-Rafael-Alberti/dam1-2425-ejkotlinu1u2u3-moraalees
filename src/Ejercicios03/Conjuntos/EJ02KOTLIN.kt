package com.dam1.ejerciciosbasicos.Ejercicios03.Conjuntos

fun ej2conj(){
    limpiarTerminal1()

    println("Introducir nombres de alumnos de primaria:")
    val primaria = pedirAlumnos("Introduce los nombres de los alumnos de primaria (finaliza con 'x')").toSet()

    limpiarTerminal1()

    println("Introducir nombres de alumnos de secundaria:")
    val secundaria = pedirAlumnos("Introduce los nombres de los alumnos de secundaria (finaliza con 'x')").toSet()

    mostrarAlumnos(primaria, secundaria)
    alumnosRepetidos(primaria, secundaria)
    noRepetidos(primaria, secundaria)
    nombresIncluidos(primaria, secundaria)
}

fun limpiarTerminal1() {
    repeat(10) { println() }
}

fun pausa1() {
    Thread.sleep(2000)
}

fun pedirAlumnos(msj: String): List<String> {
    println(msj)
    val alumnos = mutableListOf<String>()
    var alumnoLower: String
    var cont = 1

    do {
        print("$cont => ")
        val alumno = readLine()?.trim()?.replaceFirstChar { it.uppercaseChar() } ?: ""
        alumnoLower = alumno.lowercase()

        when {
            alumnoLower == "x" -> break
            alumnoLower.isEmpty() -> println("**ERROR** - Debe introducir un nombre")
            else -> {
                alumnos.add(alumno)
                cont++
            }
        }
    } while (true)

    return alumnos
}

fun mostrarAlumnos(set1: Set<String>, set2: Set<String>) {
    val todosAlumnos = set1.union(set2)
    println("Todos los alumnos sin repeticiones:")
    println(todosAlumnos.sorted().joinToString(", "))
    pausa1()
}

fun alumnosRepetidos(set1: Set<String>, set2: Set<String>) {
    val repetidos = set1.intersect(set2)
    println("\nNombres que se repiten entre primaria y secundaria:")
    if (repetidos.isNotEmpty()) {
        println(repetidos.sorted().joinToString(", "))
    } else {
        println("No hay nombres repetidos.")
    }
    pausa1()
}

fun noRepetidos(set1: Set<String>, set2: Set<String>) {
    val soloPrimaria = set1.subtract(set2)
    println("\nNombres de primaria que no están en secundaria:")
    if (soloPrimaria.isNotEmpty()) {
        println(soloPrimaria.sorted().joinToString(", "))
    } else {
        println("Todos los nombres de primaria están en secundaria.")
    }
    pausa1()
}

fun nombresIncluidos(set1: Set<String>, set2: Set<String>) {
    if (set1.containsAll(set2)) {
        println("\nTodos los nombres de primaria están incluidos en secundaria.")
    } else {
        println("\nNo todos los nombres de primaria están incluidos en secundaria.")
    }
}

fun main() {
    limpiarTerminal1()

    println("Introducir nombres de alumnos de primaria:")
    val primaria = pedirAlumnos("Introduce los nombres de los alumnos de primaria (finaliza con 'x')").toSet()

    limpiarTerminal1()

    println("Introducir nombres de alumnos de secundaria:")
    val secundaria = pedirAlumnos("Introduce los nombres de los alumnos de secundaria (finaliza con 'x')").toSet()

    mostrarAlumnos(primaria, secundaria)
    alumnosRepetidos(primaria, secundaria)
    noRepetidos(primaria, secundaria)
    nombresIncluidos(primaria, secundaria)
}