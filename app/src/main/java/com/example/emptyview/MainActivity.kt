package com.example.emptyview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textInputEditText = findViewById<TextView>(R.id.Texto)
        for (i in 0..10) {
            val calificacion = when (i.toDouble()) {
                in 0.0..5.0 -> "Suspenso"
                in 4.5..6.0 -> "Suficiente"
                in 6.0..8.0 -> "Notable"
                in 8.0..10.0 -> "Excelente"
                else -> ""
            }
            textInputEditText.setText(calificacion)
            Thread.sleep(1000)
        }
    }
}
