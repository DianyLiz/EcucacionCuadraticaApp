package com.example.proyectocalculadorafinal

import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var txtResultado: TextView
    private var numeroActual = ""
    private var numeroAnterior = ""
    private var operacion = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtResultado = findViewById(R.id.txtResultado)
        val grid = findViewById<GridLayout>(R.id.gridLayout)

        for (i in 0 until grid.childCount) {
            val boton = grid.getChildAt(i) as Button
            boton.setOnClickListener {
                manejarClick(boton.text.toString())
            }
        }
    }

    private fun manejarClick(texto: String) {
        when (texto) {
            "+", "-", "*", "/" -> {
                numeroAnterior = numeroActual
                operacion = texto
                numeroActual = ""
            }
            "=" -> calcular()
            else -> {
                numeroActual += texto
                txtResultado.text = numeroActual
            }
        }
    }

    private fun calcular() {
        if (numeroAnterior.isNotEmpty() && numeroActual.isNotEmpty()) {
            val a = numeroAnterior.toDouble()
            val b = numeroActual.toDouble()

            val resultado = when (operacion) {
                "+" -> a + b
                "-" -> a - b
                "*" -> a * b
                "/" -> if (b != 0.0) a / b else 0.0
                else -> 0.0
            }

            txtResultado.text = resultado.toString()
            numeroActual = resultado.toString()
            numeroAnterior = ""
        }
    }
}
