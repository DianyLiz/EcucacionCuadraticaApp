package com.example.kotlinbasico

fun main(){
    println("Sentencias o condicionales")
    print("a: ")
    val a = readln().toInt()
    print("b: ")
    val b = readln().toInt()

    println("Sentencia if")
    if (false)
        println("La sentencia se cumplio")
    else
        println("La sentencia no se cumplio")

    println("Sentencia if else")
    var comparacion = (a<b)
    if (comparacion)
        println("a es menor que b")
    else
        println("a es mayor que b")

    println("Sentencia if else if")
    if (comparacion)
        println(comparacion)
    else if (a==b)
        println("No use la var compracion")
    else
        println(comparacion)

    println("Sentencia when")
    println("Ingresa tu nombre para ver tu salario: ")
    val nombre = readln()
    when(nombre){
        "Diany" -> println("Tu salario es de 1,000,000")
        "Karla" -> println("Tu salario es de 2000")
        "Liz" -> println("Tu salario es de 3000")
        "Gregor" -> {
            println("Tu salario es de 5000")
            println("Tu bonificacion es de 1000")
            println("Tu salario total es de 6000")
        }
        else -> println("No se encontro tu nombre")
    }

}//main