package com.dam1.ejerciciosbasicos.Ejercicios02.Condicionales

fun ej10cond(){
    println("Bienvenido a Bella Napoli. Para empezar me gustaría preguntarle como quiere la pizza. ¿Vegetariana o no?: ")
    var pizza = readLine()?.lowercase()?.trim() ?: ""

    while (!comprobarPizza(pizza)) {
        println("Escriba qué ingrediente quiere: ")
        println("Por favor conteste con la palabra vegetariana o escriba no si es que no la quiere vegetariana: ")
        pizza = readLine()?.lowercase()?.trim() ?: ""
    }

    if (pizza == "vegetariana") {
        pizzaVegetariana(pizza)
        println("Escriba qué ingrediente quiere: ")
        var ingredientes = readLine()?.lowercase()?.trim() ?: ""

        while (!ingredienteVegetariana(ingredientes)) {
            println("Los ingredientes solo son pimiento o tofu, no los dos: ")
            ingredientes = readLine()?.lowercase()?.trim() ?: ""
        }

        finalVegetariana(pizza, ingredientes)

    } else if (pizza == "no") {
        pizzaNoVegetariana(pizza)
        println("Escriba qué ingredientes quiere: ")
        var ingredientes = readLine()?.lowercase()?.trim() ?: ""

        while (!ingredientesNoVegetariana(ingredientes)) {
            println("Los ingredientes solo son jamón o peperoni o salmón, no más de uno (Las tildes importan): ")
            ingredientes = readLine()?.lowercase()?.trim() ?: ""
        }

        finalNoVegetariana(pizza, ingredientes)
    }
}

fun comprobarPizza(pizza: String): Boolean {
    return pizza == "vegetariana" || pizza == "no"
}

fun pizzaVegetariana(pizza: String) {
    if (pizza == "vegetariana") {
        println("Perfecto. Sus ingredientes para añadir a la pizza son Pimiento o Tofu, sólo uno. El tomate y queso ya están incluidos.")
    }
}

fun ingredienteVegetariana(ingredientes: String): Boolean {
    return ingredientes == "pimiento" || ingredientes == "tofu"
}

fun finalVegetariana(pizza: String, ingredientes: String) {
    println("Perfecto, entonces su pizza es $pizza y el ingrediente que lleva es $ingredientes, tomate y queso. ¡Gracias!")
}

fun pizzaNoVegetariana(pizza: String) {
    if (pizza == "no") {
        println("Perfecto. Sus ingredientes para añadir a la pizza son Peperoni, Jamón o Salmón, sólo uno. El tomate y queso ya están incluidos.")
    }
}

fun ingredientesNoVegetariana(ingredientes: String): Boolean {
    return ingredientes == "jamón" || ingredientes == "salmón" || ingredientes == "peperoni"
}

fun finalNoVegetariana(pizza: String, ingredientes: String) {
    println("Perfecto, entonces su pizza no es vegetariana y el ingrediente que lleva es $ingredientes, tomate y queso. ¡Gracias!")
}

fun main() {
    ej10cond()
}
