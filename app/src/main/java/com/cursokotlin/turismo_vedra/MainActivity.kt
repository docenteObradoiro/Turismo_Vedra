package com.cursokotlin.turismo_vedra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.turismo_vedra.ondexantar.DondeComer_bares

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonbares = findViewById<ImageButton>(R.id.botonbares)

        botonbares.setOnClickListener {
            val acceder = Intent(this, DondeComer_bares::class.java)
            startActivity(acceder)
        }

    }
}