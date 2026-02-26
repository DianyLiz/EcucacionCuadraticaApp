package com.example.clasefuncion

/*
* AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ
* */

class Estudiante(val nombre: String?, var nota1: Double, var nota2: Double, var nota3: Double) {
    fun mostrarDatos() {
        println("Nombre: $nombre")
        println("Nota 1: $nota1")
        println("Nota 2: $nota2")
        println("Nota 3: $nota3")
    }
    fun calcularPromedio(notas: List<Double>): Double {
        val suma = notas.sum()
        return if (notas.isNotEmpty()) suma / notas.size else 0.0
    }
    fun aprobarMateria(promedio: Double): Boolean {
        return promedio >= 60.0
    }
    fun reprobarMateria(promedio: Double): Boolean {
        return promedio < 60.0
    }
    fun MostrarResultado(promedio: Double) {
        println("Estudiante: $nombre")
        println("Promedio: $promedio")
        if (aprobarMateria(promedio)) {
            println("Resultado: Aprobado")
        } else {
            println("Resultado: Reprobado")
    }
}
}
fun main() {
    println("Ingrese el nombre del estudiante")
    val nombre =readln().toString()

    println("Ingrese las notas:")
    val n1 = readln().toDouble()
    val n2 = readln().toDouble()
    val n3 = readln().toDouble()
    val estudiante = Estudiante(nombre,n1,n2,n3)
    estudiante.mostrarDatos()
}

