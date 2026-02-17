package com.example.examendianyenamorado

import kotlin.math.sqrt

fun main() {

    print("a: ")
    val a = readln().toFloat()

    print("b: ")
    val b = readln().toFloat()

    print("c: ")
    val c = readln().toFloat()

    val resul: Float = b * b - 4 * a * c

    if (resul > 0) {
        val x1 = (-b + sqrt(resul)) / (2 * a)
        val x2 = (-b - sqrt(resul)) / (2 * a)
        println("Solucions reales: $x1 y $x2")
    } else if (resul.toDouble() == 0.0) {
        val raiz = -b / (2 * a)
        println("Una solucion real: $raiz")
    } else {
        println("No tiene soluciones reales.")
    }

}