package com.example.sentencias

/** AUTOR: DIANY LIZBETH ENAMORADO FERNANDEZ */

fun main(){
    val diaSemana = DiaSemana()
    println("Ingrese un número del 1 al 7 para obtener el día de la semana:")
    val numeroDia = readln().toInt()
    val dia = diaSemana.obtenerDia(numeroDia)
    println("El día de la semana es: $dia")
}

class DiaSemana{
    fun obtenerDia(dia: Int): String {
        return when (dia) {
            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miércoles"
            4 -> "Jueves"
            5 -> "Viernes"
            6 -> "Sábado"
            7 -> "Domingo"
            else -> "Número de día no válido"
        }
    }
}