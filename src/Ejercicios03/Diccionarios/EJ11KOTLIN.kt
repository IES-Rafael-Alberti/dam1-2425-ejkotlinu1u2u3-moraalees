package com.dam1.ejerciciosbasicos.Ejercicios03.Diccionarios

val CADENA = """
    nif;nombre;email;teléfono;descuento
    01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5
    71476342J;Macarena Ramírez;macarena@mail.com;692839321;8
    63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2
    98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7
""".trimIndent()

fun ej11dic(){
    limpiarTerminal5()

    val directorio = generarDirectorio()
    println("Generando directorio, por favor espere...")
    pausa5()
    println("\nAquí lo tienes:")
    println(directorio)
}

fun limpiarTerminal5() {
    repeat(10) { println() }
}

fun pausa5() {
    Thread.sleep(2000)
}

fun generarDirectorio(): Map<String, Map<String, Any>> {
    val lineas = CADENA.trim().split("\n")
    val campos = lineas[0].split(";")
    val directorio = mutableMapOf<String, Map<String, Any>>()

    for (linea in lineas.drop(1)) {
        val valores = linea.split(";")
        val nif = valores[0]
        val datosCliente = mutableMapOf<String, Any>()

        for (i in 1 until campos.size) {
            val campo = campos[i]
            val valor = valores[i]
            if (campo == "descuento") {
                datosCliente[campo] = valor.toDouble()
            } else {
                datosCliente[campo] = valor
            }
        }

        directorio[nif] = datosCliente
    }

    return directorio
}

fun main() {
    ej11dic()
}