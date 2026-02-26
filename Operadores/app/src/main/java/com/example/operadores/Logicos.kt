package com.example.operadores

/*
* AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ
* */

fun main(){
    val rango = Rango()
    println("Ingrese un número: ")
    val numero = readln().toInt()
    println("Ingrese el inicio del rango: ")
    val inicio = readln().toInt()
    println("Ingrese el fin del rango: ")
    val fin = readln().toInt()

    println("¿El número está en el rango? ${rango.estaEnRango(numero, inicio, fin)}")
    println("¿El número está fuera del rango? ${rango.estaFueraDeRango(numero, inicio, fin)}")
    println("¿El número no está en el rango? ${rango.noEstaEnRango(numero, inicio, fin)}")
}

class Rango {
    fun estaEnRango(numero: Int, inicio: Int, fin: Int): Boolean {
        return numero in inicio..fin
    }
    fun estaFueraDeRango(numero: Int, inicio: Int, fin: Int): Boolean {
        return numero !in inicio..fin
    }
    fun noEstaEnRango(numero: Int, inicio: Int, fin: Int): Boolean {
        return !(numero in inicio..fin)
    }
}