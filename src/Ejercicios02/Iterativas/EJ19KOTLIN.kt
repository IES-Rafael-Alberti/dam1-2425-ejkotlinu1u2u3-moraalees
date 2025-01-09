package com.dam1.ejerciciosbasicos.Ejercicios02.Iterativas

fun mostrarMenu() {
    println("\nMenú del programa:")
    println("1 - Comenzar programa")
    println("2 - Imprimir listado")
    println("3 - Finalizar programa")
}

fun ejecutarOpcion(opcion: Int) {
    when (opcion) {
        1 -> println("Programa comenzado.")
        2 -> println("Listado:")
        3 -> println("Bye, bye.")
        else -> println("Opción incorrecta. Por favor, elija una opción válida.")
    }
}

fun main() {
    while (true) {
        mostrarMenu()
        print("Seleccione una opción (1, 2 o 3): ")
        val opcion = readLine()?.toIntOrNull()

        if (opcion != null) {
            if (opcion == 3) {
                ejecutarOpcion(opcion)
                break
            }
            ejecutarOpcion(opcion)
        } else {
            println("Entrada no válida. Por favor, ingrese un número.")
        }
    }
}
