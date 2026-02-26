package com.example.operadores

/*
* AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ
* */

fun main(){
    val contador = Contador()
    println("Valor inicial: ${contador.valor}")
    contador.incrementar()
    println("Valor después de incrementar: ${contador.valor}")
    contador.decrementar()
    println("Valor después de decrementar: ${contador.valor}")

}
class Contador{
    var valor: Int = 0

    fun incrementar() {
        valor++
    }

    fun decrementar() {
        valor--
    }
}