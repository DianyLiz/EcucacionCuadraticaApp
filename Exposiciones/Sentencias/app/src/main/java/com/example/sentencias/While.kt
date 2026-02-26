package com.example.sentencias

/** AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ */

fun main() {
    val validador = Validador()
    val entrada = "Hola Mundo"
    validador.validarEntrada(entrada)
}

class Validador {
    fun validarEntrada(entrada: String) {
        var contador = 0
        while (contador < entrada.length) {
            println("Caracter actual: ${entrada[contador]}")
            contador++
        }
    }
}