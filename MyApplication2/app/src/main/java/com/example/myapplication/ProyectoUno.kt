package com.example.myapplication

fun main() {
    var descuento: Float = 0.0f
    var impuesto = 0.15


    println("Compras ")
    print("Nombre Cliente: ")
    val nombre = readln().toString()

    print("Total Compra: ")
    val TotalCompra = readln().toFloat()

    var totalVenta = TotalCompra * impuesto

    var tipoCliente: String
    do {
        println("Tipo de Cliente: ")
        println("1. Regular")
        println("2. Frecuente")
        println("3. VIP")
        println("Opcion: ")
        tipoCliente = readln().toString()

    } while (tipoCliente != "1" && tipoCliente != "2" && tipoCliente != "3")

    when (tipoCliente) {
        "1" -> descuento = 0.0f
        "2" -> descuento = 0.15f
        "3" -> descuento = 0.25f
    }

    val subtotal = TotalCompra - (TotalCompra * descuento)
    val impuestoTotal = subtotal * 0.15
    val totalPagar = subtotal + impuestoTotal

    println("Nombre Cliente: $nombre")
    println("Total Compra: $TotalCompra")
    println("Descuento: ${descuento * 100}%")
    println("Subtotal: $subtotal")
    println("Impuesto: $impuestoTotal")
    println("Total a Pagar: $totalPagar")

}





