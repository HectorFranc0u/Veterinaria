package com.example.veterinaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class cartillaGatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cartilla_gatos)

        val btn = findViewById<Button>(R.id.btn_regresargato)
        val cb1 = findViewById<CheckBox>(R.id.cb_S8TF)
        val cb2 = findViewById<CheckBox>(R.id.cb_S11RT)
        val cb3 = findViewById<CheckBox>(R.id.cb_S16LF)
        val cb4 = findViewById<CheckBox>(R.id.cb_S19RL)
        val cb5 = findViewById<CheckBox>(R.id.cb_M6R)

        var puestas : String? = ""
        var nopuestas : String? = ""

        btn.setOnClickListener{

            if(cb1.isChecked){
                puestas += "Trivalente felina \n"
            }
            if(!cb1.isChecked){
                nopuestas += "Trivalente felina \n"
            }
            if(cb2.isChecked){
                puestas += "Trivalente felina (segunda dosis) \n"
            }
            if(!cb2.isChecked){
                nopuestas += "Trivalente felina (segunda dosis) \n"
            }
            if(cb3.isChecked){
                puestas += "Leucemia Felina \n"
            }
            if(!cb3.isChecked){
                nopuestas += "Leucemia Felina \n"
            }
            if(cb4.isChecked){
                puestas += "Leucemia Felina (segunda dosis) \n"
            }
            if(!cb4.isChecked){
                nopuestas += "Leucemia Felina (segunda dosis) \n"
            }
            if(cb5.isChecked){
                puestas += "Rabia \n"
            }
            if(!cb5.isChecked){
                nopuestas += "Rabia \n"
            }

            val nextG: Intent = Intent(this, Informe::class.java)
            nextG.putExtra("puestas", puestas)
            nextG.putExtra("nopuestas", nopuestas)
            startActivity(nextG)
        }
    }

}