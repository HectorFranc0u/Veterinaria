package com.example.veterinaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Informe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informe)

        val puestas: String? = intent.getStringExtra("puestas")
        val nopuestas: String? = intent.getStringExtra("nopuestas")

        val txt = findViewById<TextView>(R.id.txtreporte)
        val btn = findViewById<Button>(R.id.btn_regresarfinal)

        txt.text =
            "las vacunas que ya han sido aplicadas a su mascota son: \n \n$puestas\n las vacunas que aun faltan por aplicar son: \n \n$nopuestas"

        btn.setOnClickListener{
            val regresar : Intent = Intent(this, MainActivity::class.java)
            startActivity(regresar)
        }
    }
}