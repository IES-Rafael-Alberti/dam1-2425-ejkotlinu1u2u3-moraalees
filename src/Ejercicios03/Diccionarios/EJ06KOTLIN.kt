package com.dam1.ejerciciosbasicos.Ejercicios03.Diccionarios


fun limpiarTerminal1() {
    repeat(10) { println() }
}

fun pausa1() {
    Thread.sleep(2000)
}

fun anadirDatosDiccionario(diccionario: MutableMap<String, String>): MutableMap<String, String> {
    var salir = false

    while (!salir) {
        print("Escribe algo para añadir al diccionario (si desea parar pulse ENTER): ")
        val entrada = readLine()?.trim() ?: ""

        if (entrada.isEmpty()) {
            salir = true
        } else {
            print("Ahora añada la información que desee a -$entrada-: ")
            val dato = readLine()?.trim() ?: ""

            diccionario[entrada] = dato

            println("Sus datos almacenados son: $diccionario")
            pausa1()
            limpiarTerminal1()
        }
    }

    return diccionario
}

fun mostrarDatos(diccionario: Map<String, String>) {
    limpiarTerminal1()
    println("Se está leyendo su diccionario entero, por favor espere...\n")
    pausa1()
    pausa1()

    if (diccionario.isEmpty()) {
        println("Usted no añadió ningún dato...")
    } else {
        println("Sus datos almacenados son: $diccionario")
    }
}

fun main() {
    limpiarTerminal1()

    val datos = mutableMapOf<String, String>()

    val datosRenovados = anadirDatosDiccionario(datos)

    mostrarDatos(datosRenovados)
}
