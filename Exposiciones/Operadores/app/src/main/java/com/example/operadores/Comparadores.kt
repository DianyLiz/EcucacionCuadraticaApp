package com.example.operadores

/*
* AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ
* */

fun main(){
    val comp = Comparaciones()
    println("a:")
    val a = readln().toInt()
    println("b: ")
    val b = readln().toInt()

    println("Igual: ${comp.esIgual(a,b)}")
    println("Diferente: ${comp.esDiferente(a,b)}")
    println("Mayor: ${comp.esMayor(a,b)}")
    println("Menor: ${comp.esMenor(a,b)}")
    println("Mayor o Igual: ${comp.esMayorOIgual(a,b)}")
    println("Menor o Igual: ${comp.esMenorOIgual(a,b)}")
}
class Comparaciones {
    fun esIgual(a: Int, b: Int): Boolean {
        return a == b
    }
    fun esDiferente(a: Int, b: Int): Boolean {
        return a != b
    }
    fun esMayor(a: Int, b: Int): Boolean {
        return a > b
    }
    fun esMenor(a: Int, b: Int): Boolean {
        return a < b
    }
    fun esMayorOIgual(a: Int, b: Int): Boolean {
        return a >= b
    }
    fun esMenorOIgual(a: Int, b: Int): Boolean {
        return a <= b
    }
}