package com.example.clasefuncion

/*
* AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ
* */

class Rectangulo(var base: Double, var altura: Double) {
    fun area(): Double {
        return base * altura
    }
}

fun main() {
    val rectangulo1 = Rectangulo(5.0, 3.0)
    println("El área del rectángulo es: ${rectangulo1.area()}")
}