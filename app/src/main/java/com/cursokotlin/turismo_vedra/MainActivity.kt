package com.cursokotlin.turismo_vedra

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.ondedormir.OndeDurmir
import com.cursokotlin.turismo_vedra.ondexantar.DondeComer_Restaurantes
import com.cursokotlin.turismo_vedra.ondexantar.DondeComer_bares

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonbares = findViewById<Button>(R.id.botonbares)
        botonbares.setOnClickListener {
            val acceder = Intent(this, DondeComer_bares::class.java)
            startActivity(acceder)
        }

        val botonrestaurantes = findViewById<Button>(R.id.botonrestaurantes)
        botonrestaurantes.setOnClickListener {
            val acceder = Intent(this, DondeComer_Restaurantes::class.java)
            startActivity(acceder)
        }

        val botondormir = findViewById<Button>(R.id.botondormir)
        botondormir.setOnClickListener {
            val acceder = Intent(this, OndeDurmir::class.java)
            startActivity(acceder)
        }

    }
}