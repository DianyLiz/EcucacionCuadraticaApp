package com.example.kotlinbasico

fun main(){
    println("Ciclos o bucles")
    println("Ciclo for")
    for (i in 1..5)
        println(i)

    val nombre = "Diany "
    for (i in 0..nombre.length-1)
        print(nombre[i])

    for (letra in nombre)
        print(letra)


    nombre.forEach { letra -> print(letra) }
    nombre.forEach { print(it) }

    println("Ciclo while y Do while")
    var indice = 0
    while (indice<nombre.length){
        println("Indice: $indice = ${nombre[indice]}")
         indice++
    }

    indice = nombre.length
    do {
        indice=indice-1
        println("XXXXIndice: $indice = ${nombre[indice]}")
    }while (
        indice>0
    )
}//main