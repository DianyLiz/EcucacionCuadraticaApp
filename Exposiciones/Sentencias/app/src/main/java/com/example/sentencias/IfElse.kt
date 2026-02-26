package com.example.sentencias

/** AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ */

fun main(){
    val edad = 20
    val mayorEdad = mayorEdad()
    if (mayorEdad.esMayorDeEdad(edad)) {
        println("Eres mayor de edad.")
    } else {
        println("Eres menor de edad.")
    }
}

class mayorEdad{
    fun esMayorDeEdad(edad: Int): Boolean {
        return edad >= 18
    }

}