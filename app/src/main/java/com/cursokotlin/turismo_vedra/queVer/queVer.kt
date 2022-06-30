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

class queVer:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_que_ver)

        val botonVedra = findViewById<ImageButton>(R.id.botonVedraMapa)
        botonVedra.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        val accesoMenu= findViewById<ImageButton>(R.id.menu)
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        val boton1 = findViewById<ImageButton>(R.id.boton1)
        boton1.setOnClickListener {
            val accederNaturaleza = Intent(this, naturaleza::class.java)
            startActivity(accederNaturaleza)
        }
        val boton2 = findViewById<ImageButton>(R.id.boton2)
        boton2.setOnClickListener {
            val accederArquitectura = Intent(this, arquitectura::class.java)
            startActivity(accederArquitectura)
        }
        val boton3 = findViewById<ImageButton>(R.id.boton3)
        boton3.setOnClickListener {
            val accederPatrimonioHistorico = Intent(this, patrimonio_historico::class.java)
            startActivity(accederPatrimonioHistorico)
        }

        val informacionTuristica = findViewById<TextView>(R.id.infoTuristica)
        informacionTuristica.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/node/44")))
        }

        val paginaConcello = findViewById<TextView>(R.id.webConcello)
        paginaConcello.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/")))
        }
    }

}