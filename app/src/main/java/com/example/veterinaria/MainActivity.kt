package com.example.veterinaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnperros = findViewById<Button>(R.id.btn_perros)
        val btngatos = findViewById<Button>(R.id.btn_gatos)

        btnperros.setOnClickListener{
            val perro:Intent = Intent(this, cartillaperros::class.java)
            startActivity(perro)
        }

        btngatos.setOnClickListener{
            val gato:Intent = Intent(this, cartillaGatos::class.java)
            startActivity(gato)
        }
    }


    // asi damos funcionalidad al menu y al boton para acceder a la activity "acerca de"
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.acercade, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.btn_AcercaDe -> {
                val config: Intent = Intent(this, acercade::class.java)
                startActivity(config)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}