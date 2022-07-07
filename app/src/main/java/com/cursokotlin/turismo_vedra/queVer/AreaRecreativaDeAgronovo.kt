package com.cursokotlin.turismo_vedra.queVer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.cursokotlin.turismo_vedra.MainActivity
import com.cursokotlin.turismo_vedra.R

class AreaRecreativaDeAgronovo: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_recreativa_de_agronovo)

        var logoVedra=findViewById<ImageButton>(R.id.logoVedra)
        logoVedra.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        var menu=findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder= Intent(this, com.cursokotlin.turismo_vedra.Menu::class.java)
            startActivity(acceder)
        }

        val maps = findViewById<ImageButton>(R.id.maps)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/nTaW7bVeuz95eVgCA")))
        }

        val informacionTuristica = findViewById<TextView>(R.id.tvInformacionTuristica)
        informacionTuristica.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/node/44")))
        }

        val paginaConcello = findViewById<TextView>(R.id.tvWebVedra)
        paginaConcello.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/")))
        }
    }
}