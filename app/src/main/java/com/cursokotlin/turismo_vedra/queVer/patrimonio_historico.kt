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

class patrimonio_historico: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patrimonio_historico)

        var logoVedra=findViewById<ImageButton>(R.id.logoVedra)
        logoVedra.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }
        var menu=findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder= Intent(this, Menu::class.java)
            startActivity(acceder)
        }
        val boton1 = findViewById<ImageButton>(R.id.boton1)
        boton1.setOnClickListener {
            val accederIgrexaVedra = Intent(this, igrexaFonteCruceiroVedra::class.java)
            startActivity(accederIgrexaVedra)
        }
        val boton2 = findViewById<ImageButton>(R.id.boton2)
        boton2.setOnClickListener {
            val accederCapelaSANTIAGUIÑO = Intent(this, capillaFuenteSANTIAGUIÑO::class.java)
            startActivity(accederCapelaSANTIAGUIÑO)
        }
        val boton3 = findViewById<ImageButton>(R.id.boton3)
        boton3.setOnClickListener {
            val accederRoteiroEmigracion = Intent(this, roteiroEmigracion::class.java)
            startActivity(accederRoteiroEmigracion)
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