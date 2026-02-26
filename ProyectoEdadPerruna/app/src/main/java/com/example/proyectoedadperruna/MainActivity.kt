package com.example.proyectoedadperruna

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "MainActivity creada")

        val etEdad = findViewById<EditText>(R.id.etEdad)
        val rgTamano = findViewById<RadioGroup>(R.id.rgTamaño)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btnCalcular = findViewById<MaterialButton>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {

            val edadPerro = etEdad.text.toString().toIntOrNull()

            if (edadPerro == null || edadPerro <= 0) {
                tvResultado.text = "Ingrese una edad válida"
                return@setOnClickListener
            }

            val humano = when (rgTamano.checkedRadioButtonId) {

                R.id.rbPequeño -> calcularEdadHumana(edadPerro, 4)
                R.id.rbMediano -> calcularEdadHumana(edadPerro, 5)
                R.id.rbGrande,
                R.id.rbGigante -> calcularEdadHumana(edadPerro, 6)

                else -> {
                    tvResultado.text = "Seleccione un tamaño"
                    return@setOnClickListener
                }
            }

            tvResultado.text = "Edad en años humanos: $humano años"
        }
    }

    // 👇 ESTA FUNCIÓN VA FUERA DE onCreate
    private fun calcularEdadHumana(edadPerro: Int, incremento: Int): Int {

        return when {
            edadPerro == 1 -> 15
            edadPerro == 2 -> 24
            else -> 24 + (edadPerro - 2) * incremento
        }
    }
}