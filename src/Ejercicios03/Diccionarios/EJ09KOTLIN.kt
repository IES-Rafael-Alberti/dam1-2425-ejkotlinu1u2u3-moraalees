package com.dam1.ejerciciosbasicos.Ejercicios03.Diccionarios

val VALORES = listOf("1.", "2.", "3.")

fun ej9dic(){
    limpiarTerminal4()

    val facturas = mutableMapOf<String, Double>()

    corresponderEntrada(facturas)
}

fun limpiarTerminal4() {
    repeat(10) { println() }
}

fun pausa4() {
    Thread.sleep(2000)
}

fun comprobarEntero(num: String): Boolean {
    return num.toIntOrNull() != null
}

fun comprobarPrecio2(num: String): Boolean {
    return try {
        val comprobacion = num.toDouble()
        comprobacion > 0
    } catch (e: Exception) {
        false
    }
}

fun mostrarMenu() {
    println("Presione una de las tres teclas a continuación:\n")
    println("1. Añadir factura.")
    println("2. Pagar factura")
    println("3. Terminar programa")
    pausa4()
}

fun comprobarEntrada(entrada: String): Boolean {
    return VALORES.contains(entrada)
}

fun salirPrograma(facturas: MutableMap<String, Double>): Boolean {
    return facturas.isEmpty()
}

fun corresponderEntrada(diccionario: MutableMap<String, Double>) {
    var salir = false
    var contadorCobrosRealizados = 0.0
    var contadorCobrosPendientes = 0.0

    while (!salir) {
        if (diccionario.isEmpty()) {
            limpiarTerminal4()
            println("No hay ninguna cantidad cobrada ni cobro pendiente.")
            pausa4()
        } else {
            limpiarTerminal4()
            println("Cantidad cobrada: $contadorCobrosRealizados€")
            println("Cantidad pendiente: $contadorCobrosPendientes€")
            pausa4()
        }

        limpiarTerminal4()
        mostrarMenu()
        var entrada = readLine()?.trim()

        while (entrada != null && !comprobarEntrada(entrada)) {
            println("Solo debes escribir 1. / 2. / 3. : ")
            entrada = readLine()?.trim()
        }

        when (entrada) {
            "1." -> {
                limpiarTerminal4()
                contadorCobrosPendientes += anadirFactura(diccionario, contadorCobrosPendientes)
            }
            "2." -> {
                limpiarTerminal4()
                contadorCobrosRealizados += pagarFactura(diccionario, contadorCobrosRealizados)
            }
            "3." -> {
                limpiarTerminal4()
                if (!salirPrograma(diccionario)) {
                    println("Le quedan facturas por pagar todavía... Debe pagarlas antes de irse.")
                    pausa4()
                } else {
                    salir = true
                }
            }
        }
    }

    println("Bye, bye...")
}

fun anadirFactura(nFacturas: MutableMap<String, Double>, contador: Double): Double {
    println(nFacturas)
    println("Escriba el número de factura: ")
    var nFactura = readLine()?.trim()

    while (nFactura != null && !comprobarEntero(nFactura)) {
        println("**ERROR** - El número de factura debe ser uno entero positivo: ")
        nFactura = readLine()?.trim()
    }

    limpiarTerminal4()
    println("Ahora escriba el coste de la factura nº$nFactura: ")
    var coste = readLine()?.trim()

    while (coste == null || !comprobarPrecio2(coste)) {
        println("**ERROR** - El coste debe ser un número mayor que 0: ")
        coste = readLine()?.trim()
    }

    nFacturas[nFactura ?: ""] = coste.toDouble()
    pausa4()

    return coste.toDouble()
}

fun pagarFactura(facturasDisponibles: MutableMap<String, Double>, contadorPago: Double): Double {
    if (facturasDisponibles.isEmpty()) {
        println("No hay facturas por pagar...")
        pausa4()
    } else {
        println(facturasDisponibles)
        println("Escriba el número de factura que quiere pagar: ")
        var factura = readLine()?.trim()

        while (factura != null && !comprobarEntero(factura)) {
            println("**ERROR** - El número de factura debe ser uno entero positivo: ")
            factura = readLine()?.trim()
        }

        while (factura != null && !facturasDisponibles.containsKey(factura)) {
            println("**ERROR** - El número $factura no está registrado: ")
            factura = readLine()?.trim()
        }

        factura?.let {
            val pago = facturasDisponibles[it] ?: 0.0
            facturasDisponibles.remove(it)
            println("La factura como número $factura se ha eliminado correctamente.")
            pausa4()
            return pago
        }
    }
    return contadorPago
}

fun main() {
    ej9dic()
}