package com.example.clasefuncion

/*
* AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ
 */

class Persona (var nombre: String, var edad: Int) {
    fun mostrarDatos() {
        println("Nombre: $nombre")
        println("Edad: $edad")
    }
}

fun main() {
    val persona1 = Persona("Diany", 21)
    persona1.mostrarDatos()
}