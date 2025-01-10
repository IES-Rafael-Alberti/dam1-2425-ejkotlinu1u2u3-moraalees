package com.dam1.ejerciciosbasicos.Ejercicios02.Condicionales

fun ej6cond(){
    println("Introduzca su nombre para ver a qué grupo perteneces: ")
    var nombre = readLine()?.lowercase()?.trim() ?: ""

    while (!comprobarNombre(nombre)) {
        println("Escriba el de verdad por favor: ")
        nombre = readLine()?.lowercase()?.trim() ?: ""
    }

    println("Introduzca su género (Hombre o mujer, no me vengas con tonterías...): ")
    var sexo = readLine()?.lowercase()?.trim() ?: ""

    while (!comprobarSexo(sexo)) {
        println("Te he dicho que no digas tonterías. Escriba o mujer u hombre, como prefieras: ")
        sexo = readLine()?.lowercase()?.trim() ?: ""
    }

    grupoPertenece(nombre, sexo)
}

fun grupoPertenece(nombre: String, sexo: String) {
    when {
        nombre[0] < 'm' && sexo == "mujer" -> 
            println("Como tu nombre empieza por ${nombre[0].uppercase()}, tu grupo correspondiente es el A.")
        nombre[0] > 'n' && sexo == "hombre" -> 
            println("Como tu nombre empieza por ${nombre[0].uppercase()}, tu grupo correspondiente es el A.")
        nombre[0] >= 'm' && sexo == "mujer" -> 
            println("Como tu nombre empieza por ${nombre[0].uppercase()}, tu grupo correspondiente es el B.")
        nombre[0] <= 'n' && sexo == "hombre" -> 
            println("Como tu nombre empieza por ${nombre[0].uppercase()}, tu grupo correspondiente es el B.")
    }
}

fun comprobarNombre(nombre: String): Boolean {
    return nombre.none { it.isDigit() }
}

fun comprobarSexo(sexo: String): Boolean {
    return sexo == "hombre" || sexo == "mujer"
}

fun main() {
    ej6cond()
}