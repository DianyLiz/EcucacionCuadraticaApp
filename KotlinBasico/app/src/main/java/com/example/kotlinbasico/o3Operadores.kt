package com.example.kotlinbasico

fun main(){
    println("Operadore Elvis")
    var version: Int?=3
    println("La version de Android es: $version")
//    version=null
    println("La version de Android es: $version")
    println("La version de Android es: ${version?:-1}")

    println("Operadores Aritmeticos")
//    print("Ingresa el primer numero: ")
//    var num1= readln().toInt()
//    print("Ingresa el segundo numero: ")
//    var num2= readln().toInt()
//    println("La suma es: ${num1+num2}")

    println("Operadores de incremento")
    var x: Int = 10
    var xmas = ++x
    var xmenos = x++
    println(xmas)
    println(xmenos)


    println("Operadores de igualdad")
    var esIgual: Boolean = (3==3)
    println(esIgual)

    var noEsigual: Boolean = (3!=2)
    println(noEsigual)

    println("Operadores Logicos")
    val valorO = (1==1 || 1==5)
    println("or: $valorO")

    val valorY = (1==1 && 1==5)
    println("and: $valorY")

    val valorMenoroIgualque = (3<=5)
    println("Menor que: $valorMenoroIgualque")

    val valorMayoroIgualque = (3>=5)
    println("Mayor que: $valorMayoroIgualque")


}//main