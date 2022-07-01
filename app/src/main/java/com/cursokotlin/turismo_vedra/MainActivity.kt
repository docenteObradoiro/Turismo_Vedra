package com.cursokotlin.turismo_vedra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cursokotlin.turismo_vedra.queFacer.QueFacerPrincipal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var botonQueFacer = findViewById<Button>(R.id.btQueFacer)
        botonQueFacer.setOnClickListener {
            val acceder = Intent(this, QueFacerPrincipal::class.java)
            startActivity(acceder)
        }
    }
}