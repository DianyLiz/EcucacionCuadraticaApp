package com.example.kotlinbasico

fun main(){
    //booleanas
    val soyPatepluma=false
    println("Soy patepluma? $soyPatepluma")

    println("Numeros Enteros")
    var entero: Int = 120
    println("Valor de la variable entero: $entero")

    val milisegundos: Long = 21_474_836_471L
    println("Valor de la variable milisegundos: $milisegundos")

    println("Numeros Decimales")
    val pi : Float = 3.1416F
    println("Valor de la variable pi: $pi")

    println("Cadena de caracteres")
    val nombre : String = "Diany"
    println("Valor de la variable nombre: $nombre")
    val casosEspeciales: String = "Hola, soy \"n\" Diany"
    println(": $casosEspeciales")

    println("Concatenacion")
    println("Escribe tu nombre completo: ")
    val nombreCompleto= readln()
    println("Mi nombre completo es: $nombreCompleto")
    println("Hola "+nombreCompleto)

    println("NULABILIDAD")
    var sobreNombre: String?=null
    sobreNombre="Liz"
    println("La longitud de la variable sobreNombre: ${sobreNombre!!.length}")
    sobreNombre=null
    println("La longitud de la variable sobreNombre: ${sobreNombre?.length}")
}//main