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

    class arquitectura: AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_arquitectura)

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
            val boton1 = findViewById<ImageButton>(R.id.boton1)
            boton1.setOnClickListener {
                val accederPazoSantaCruzRibadulla = Intent(this, PazoSantaCruzRibadulla::class.java)
                startActivity(accederPazoSantaCruzRibadulla)
            }
            val boton2 = findViewById<ImageButton>(R.id.boton2)
            boton2.setOnClickListener {
                val accederPuenteGundian = Intent(this, PuenteGundian::class.java)
                startActivity(accederPuenteGundian)
            }
            val boton3 = findViewById<ImageButton>(R.id.boton3)
            boton3.setOnClickListener {
                val accederPuenteAVEGundian = Intent(this, PuenteAVEGundian::class.java)
                startActivity(accederPuenteAVEGundian)
            }
            val boton4 = findViewById<ImageButton>(R.id.boton4)
            boton4.setOnClickListener {
                val accederPuenteColganteXimonde = Intent(this, PuenteColganteXimonde::class.java)
                startActivity(accederPuenteColganteXimonde)
            }
            val boton5 = findViewById<ImageButton>(R.id.boton5)
            boton5.setOnClickListener {
                val accederMolinoReboredo = Intent(this, MolinoReboredo::class.java)
                startActivity(accederMolinoReboredo)
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