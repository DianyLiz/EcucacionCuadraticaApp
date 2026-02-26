package com.example.actividadbuena

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Programación de la actividad
        Log.d("MainActivity", "MainActivity creada")

        val edadxHumana = findViewById<EditText>(R.id.edadHumana)
        val edadxPerruna = findViewById<TextView>(R.id.edadPerruna)
        val boton = findViewById<MaterialButton>(R.id.boton)


        boton.setOnClickListener {

            val edadHumanaString= edadxHumana.text.toString()
            if (edadHumanaString.isEmpty()) {
               val edadHumanaInt = edadHumanaString.toInt()
                val edadPerrunaInt = edadHumanaInt * 7
           } else {
                Log.d("MainActivity" ,"No se ingresó una edad humana válida")
              Toast.makeText(this, "Por favor ingresa una edad humana válida", Toast.LENGTH_SHORT).show()
            }

      }


    }
}