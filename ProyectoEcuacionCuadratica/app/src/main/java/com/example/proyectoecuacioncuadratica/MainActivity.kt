package com.example.proyectoecuacioncuadratica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etA = findViewById<EditText>(R.id.etA)
        val etB = findViewById<EditText>(R.id.etB)
        val etC = findViewById<EditText>(R.id.etC)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnCalcular.setOnClickListener {

            val a = etA.text.toString().toDoubleOrNull()
            val b = etB.text.toString().toDoubleOrNull()
            val c = etC.text.toString().toDoubleOrNull()

            if (a == null || b == null || c == null) {
                tvResultado.text = "Ingrese valores válidos"
                return@setOnClickListener
            }

            if (a == 0.0) {
                tvResultado.text = "El valor de 'a' no puede ser 0"
                return@setOnClickListener
            }

            val discriminante = b * b - 4 * a * c

            if (discriminante > 0) {
                val x1 = (-b + sqrt(discriminante)) / (2 * a)
                val x2 = (-b - sqrt(discriminante)) / (2 * a)

                tvResultado.text = "X1 = $x1\nX2 = $x2"

            } else if (discriminante == 0.0) {

                val x = -b / (2 * a)
                tvResultado.text = "X1 = X2 = $x"

            } else {

                tvResultado.text = "No tiene soluciones reales"
            }
        }
    }
}