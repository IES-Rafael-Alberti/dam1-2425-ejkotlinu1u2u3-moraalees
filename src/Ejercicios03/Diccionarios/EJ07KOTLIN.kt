package com.dam1.ejerciciosbasicos.Ejercicios03.Diccionarios

import java.util.*

fun limpiarTerminal2() {
    repeat(10) { println() }
}

fun pausa2() {
    Thread.sleep(2000)
}

fun comprobarPrecio(num: String): Boolean {
    return try {
        val price = num.toDouble()
        price > 0
    } catch (e: NumberFormatException) {
        false
    }
}

fun anadirProductosADiccionario(diccionario: MutableMap<String, Double>): MutableMap<String, Double> {
    var parar = false
    val scanner = Scanner(System.`in`)

    while (!parar) {
        println("Escriba su producto para añadirlo a la lista (si desea parar pulse ENTER): ")
        val producto = scanner.nextLine().trim()

        if (producto.isEmpty()) {
            parar = true
        } else {
            limpiarTerminal2()
            println("Ahora añada el precio de -$producto-:")
            var precio = scanner.nextLine().trim()

            while (!comprobarPrecio(precio)) {
                println("El precio debe ser un número mayor que 0...")
                precio = scanner.nextLine().trim()
            }

            diccionario[producto] = precio.toDouble()

            diccionario.forEach { (entrada, precio) ->
                println("\nUsted añadió a su lista de la compra -$entrada-, cuyo precio es $precio")
            }
            pausa2()
            limpiarTerminal2()
        }
    }

    return diccionario
}

fun mostrarLista(diccionario: MutableMap<String, Double>) {
    limpiarTerminal2()
    println("Se está leyendo su lista entera, por favor espere...\n")
    pausa2()

    if (diccionario.isEmpty()) {
        println("Usted no añadió ningún producto...")
    } else {
        diccionario.forEach { (entrada, precio) ->
            println("Usted añadió a su lista de la compra -$entrada-, cuyo precio es $precio")
        }
    }
}

fun mostrarPrecioTotal(diccionario: MutableMap<String, Double>) {
    limpiarTerminal2()
    val total = diccionario.values.sum()
    println("El total que deberá pagar por los productos es de $total.")
}

fun main() {
    limpiarTerminal2()

    val listaCompra = mutableMapOf<String, Double>()

    val listaCompraActualizada = anadirProductosADiccionario(listaCompra)

    mostrarLista(listaCompraActualizada)

    mostrarPrecioTotal(listaCompraActualizada)
}