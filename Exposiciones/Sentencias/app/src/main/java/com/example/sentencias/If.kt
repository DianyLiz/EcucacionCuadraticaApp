package com.example.sentencias

/** AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ */

fun main(){
    val evaluador = Evaluador()
    evaluador.evaluarNumero(10)
    evaluador.evaluarNumero(-5)
    evaluador.evaluarNumero(0)
}

class Evaluador{
    fun evaluarNumero(numero: Int){
        if (numero > 0) {
            println("El número es positivo.")
        } else if (numero < 0) {
            println("El número es negativo.")
        } else {
            println("El número es cero.")
        }
    }
}