package com.example.sentencias

/** AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ */

fun main(){
    val contador = Contador()
    contador.contar(5)
}

class Contador{
    fun contar(num: Int){
        for (i in 1..num){
            println(i)
        }
    }
}