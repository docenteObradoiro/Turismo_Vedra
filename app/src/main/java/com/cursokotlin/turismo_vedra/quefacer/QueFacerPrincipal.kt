package com.cursokotlin.turismo_vedra.quefacer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.MainActivity
import com.cursokotlin.turismo_vedra.Menu
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cursokotlin.turismo_vedra.R

class QueFacerPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_que_facer_principal)

        var logoVedra=findViewById<ImageButton>(R.id.logoVedra)
        logoVedra.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        var menu = findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

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

        val botonActividadesDeportivas = findViewById<ImageButton>(R.id.imgActividadesDeportivas)
        botonActividadesDeportivas.setOnClickListener {
            val acceder = Intent(this, ActividadesDeportivas::class.java)
            startActivity(acceder)
        }
        val botonCamino = findViewById<ImageButton>(R.id.imgCaminoSantiago)
        botonCamino.setOnClickListener {
            val acceder = Intent(this, CaminoSantiago::class.java)
            startActivity(acceder)
        }
    }
}