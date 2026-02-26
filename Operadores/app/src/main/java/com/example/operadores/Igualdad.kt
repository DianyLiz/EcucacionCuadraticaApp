package com.example.operadores

/*
* AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ
* */

fun main(){
    val jugar = NumeroSecreto()
    print("Adivina el numero secreto: ")
    val num = readln().toInt()
    println("El numero que usted ingreso: ${jugar.verificarNumero(num)}")
    println("El numero correcto es: ${jugar.verificarNumero(num)}")
}

class NumeroSecreto {
    private val numSecreto = 14
    fun verificarNumero(num: Int): Boolean {
        return num == numSecreto
    }
}