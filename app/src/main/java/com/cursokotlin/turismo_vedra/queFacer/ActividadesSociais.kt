package com.cursokotlin.turismo_vedra.queFacer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.R

class ActividadesSociais : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividades_sociais)

        val infoTuristica=findViewById<TextView>(R.id.tvInformacionTuristica)
        infoTuristica.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/es/node/459")))
        }

        val webConcello =findViewById<TextView>(R.id.tvWebVedra)
        webConcello.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/es")))
        }


        val botonFestasGastronomicas = findViewById<ImageButton>(R.id.imgFestasGastronomicas)
        botonFestasGastronomicas.setOnClickListener {
            val acceder = Intent(this, FestasGastronomicas::class.java)
            startActivity(acceder)
        }
        val botonFestasRelixiosas = findViewById<ImageButton>(R.id.imgActividadesRelixiosas)
        botonFestasRelixiosas.setOnClickListener {
            val acceder = Intent(this, FestasLocais::class.java)
            startActivity(acceder)
        }

        val botonXeneraisUlla =findViewById<ImageButton>(R.id.imgXenerais)
        botonXeneraisUlla.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://xeneraisdaulla.gal/")))
        }
        val botonRutaCamelia =findViewById<ImageButton>(R.id.rutaCamelia)
        botonRutaCamelia.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.turismo.gal/que-facer/ruta-da-camelia?langId=gl_ES")))
        }


    }
}