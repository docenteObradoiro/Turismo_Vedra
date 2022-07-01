package com.cursokotlin.turismo_vedra.queFacer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.R

class QueFacerPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_que_facer_principal)

        val infoTuristica=findViewById<TextView>(R.id.tvInformacionTuristica)
        infoTuristica.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/es/node/459")))
        }

        val webConcello =findViewById<TextView>(R.id.tvWebVedra)
        webConcello.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/es")))
        }

        val botonActividadesSociais = findViewById<ImageButton>(R.id.imgActividadesSociais)
        botonActividadesSociais.setOnClickListener {
            val acceder = Intent(this, ActividadesSociais::class.java)
            startActivity(acceder)
        }
    }
}