package com.example.clasefuncion

/*
* AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ
* */
fun main(){
    print("Ingrese el numero 1: ")
    val num1:Int = readln().toInt()
    print("Ingrese el numero 2: ")
    val num2:Int = readln().toInt()

    println("La suma es: ${sumar(num1, num2)}")
    println("La resta es: ${restar(num1, num2)}")
    println("La multiplicacion es: ${multiplicar(num1, num2)}")
    println("La division es: ${dividir(num1, num2)}")

}
fun sumar(a: Int, b: Int): Int {
    return a + b
}
fun restar(a: Int, b: Int): Int {
    return a - b
}
fun multiplicar(a: Int, b: Int): Int {
    return a * b
}
fun dividir(a: Int, b: Int): Int {
    if (b != 0) {
        return a / b
    } else {
        println("Error: No se puede dividir por cero.")
        return 0
    }
}