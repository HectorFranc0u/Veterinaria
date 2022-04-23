package com.example.veterinaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class acercade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acercade)

        val btn = findViewById<Button>(R.id.btn_Adreturn)

        btn.setOnClickListener{
            val back : Intent = Intent(this, MainActivity::class.java)
            startActivity(back)
        }
    }
}