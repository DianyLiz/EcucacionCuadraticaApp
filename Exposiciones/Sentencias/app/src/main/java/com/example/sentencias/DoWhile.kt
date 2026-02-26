package com.example.sentencias
/*
* AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ
* */

fun main(){
    val menu = Menu()
    menu.mostrarMenu()
}

class Menu{
    fun mostrarMenu() {
        var opcion: Int
        do {
            println("Menú:")
            println("1. Opción 1")
            println("2. Opción 2")
            println("3. Salir")
            print("Seleccione una opción: ")
            opcion = readln().toInt()

            when (opcion) {
                1 -> println("Has seleccionado la Opción 1")
                2 -> println("Has seleccionado la Opción 2")
                3 -> println("Saliendo del menú...")
                else -> println("Opción no válida, por favor intente de nuevo.")
            }
        } while (opcion != 3)
    }
}

