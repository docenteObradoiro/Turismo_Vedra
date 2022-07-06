package com.cursokotlin.turismo_vedra.ondexantar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.ComoChegar
import com.cursokotlin.turismo_vedra.R

class OndeComerPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onde_comer_principal)

        var botonbar = findViewById<ImageButton>(R.id.botonbar)
        botonbar.setOnClickListener {
            val acceder = Intent(this, DondeComer_bares::class.java)
            startActivity(acceder)
        }
        var botonres = findViewById<ImageButton>(R.id.botonres)
        botonres.setOnClickListener {
            val acceder = Intent(this, DondeComer_Restaurantes::class.java)
            startActivity(acceder)
        }
    }
}