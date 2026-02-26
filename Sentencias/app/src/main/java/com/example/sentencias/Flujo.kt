package com.example.sentencias

/** AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ */

fun main(){
    val controlFlujo = ControlFlujo()
    controlFlujo.ejemploIfElse()
    controlFlujo.ejemploWhen()
}


class ControlFlujo{
    fun ejemploIfElse(){
        val numero = 10
        if (numero > 0) {
            println("El número es positivo.")
        } else if (numero < 0) {
            println("El número es negativo.")
        } else {
            println("El número es cero.")
        }
    }

    fun ejemploWhen(){
        val dia = 3
        when (dia) {
            1 -> println("Lunes")
            2 -> println("Martes")
            3 -> println("Miércoles")
            4 -> println("Jueves")
            5 -> println("Viernes")
            6 -> println("Sábado")
            7 -> println("Domingo")
            else -> println("Número de día no válido.")
        }
    }
}