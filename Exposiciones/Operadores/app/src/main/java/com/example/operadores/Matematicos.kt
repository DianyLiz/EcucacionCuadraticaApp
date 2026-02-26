package com.example.operadores
/** AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ
 * */

fun main(){
    val op = OperadoresMatematicos()
    println("Ingrese el primer número: ")
    val a = readln().toInt()
    println("Ingrese el segundo número: ")
    val b = readln().toInt()

    println("Suma: ${op.suma(a, b)}")
    println("Resta: ${op.resta(a, b)}")
    println("Multiplicación: ${op.multiplicacion(a, b)}")
    println("División: ${op.division(a, b)}")
}
class OperadoresMatematicos {
    fun suma(a: Int, b: Int): Int {
        return a + b
    }
    fun resta(a: Int, b: Int): Int {
        return a - b
    }
    fun multiplicacion(a: Int, b: Int): Int {
        return a * b
    }
    fun division(a: Int, b: Int): Double {
        if (b != 0) {
            return a.toDouble() / b.toDouble()
        } else {
            throw IllegalArgumentException("No se puede dividir por cero")
        }
    }
}