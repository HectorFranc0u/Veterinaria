package com.example.veterinaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class cartillaperros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cartillaperros)

        val btn = findViewById<Button>(R.id.btn_nextperro)
        val cb1 = findViewById<CheckBox>(R.id.cb_S6MoB)
        val cb2 = findViewById<CheckBox>(R.id.cb_S9PC)
        val cb3 = findViewById<CheckBox>(R.id.cb_S12Pent)
        val cb4 = findViewById<CheckBox>(R.id.cb_6MRabia)
        val cb5 = findViewById<CheckBox>(R.id.cb_AnualMoB)
        val cb6 = findViewById<CheckBox>(R.id.cb_AnualPent)
        val cb7 = findViewById<CheckBox>(R.id.cb_AnualAntirrabica)

        var puestas : String? = ""
        var nopuestas : String? = ""

        btn.setOnClickListener{

            if(cb1.isChecked){
                puestas += "Monovalente o bivalente \n"
            }
            if(!cb1.isChecked){
                nopuestas += "Monovalente o bivalente \n"
            }
            if(cb2.isChecked){
                puestas += "Polivalente canina \n"
            }
            if(!cb2.isChecked){
                nopuestas += "Polivalente canina \n"
            }
            if(cb3.isChecked){
                puestas += "Pentavalente \n"
            }
            if(!cb3.isChecked){
                nopuestas += "Pentavalente \n"
            }
            if(cb4.isChecked){
                puestas += "Antirabica \n"
            }
            if(!cb4.isChecked){
                nopuestas += "Antirabica \n"
            }
            if(cb5.isChecked){
                puestas += "Monovalente o Bivalente (anual) \n"
            }
            if(!cb5.isChecked){
                nopuestas += "Monovalente o Bivalente (anual) \n"
            }
            if(cb6.isChecked){
                puestas += "Pentavalente (anual) \n"
            }
            if(!cb6.isChecked){
                nopuestas += "Pentavalente (anual) \n"
            }
            if(cb7.isChecked){
                puestas += "Antirabica (anual) \n"
            }
            if(!cb7.isChecked){
                nopuestas += "Antirabica (anual) \n"
            }

            val nextP : Intent = Intent(this, Informe::class.java)
            nextP.putExtra("puestas", puestas)
            nextP.putExtra("nopuestas", nopuestas)
            startActivity(nextP)
        }
    }
}