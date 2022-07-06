package com.cursokotlin.turismo_vedra

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.ondedurmir.OndeDurmir
import com.cursokotlin.turismo_vedra.ondexantar.OndeComerPrincipal
import com.cursokotlin.turismo_vedra.productoresLocales.ProductoresLocales
import com.cursokotlin.turismo_vedra.queVer.QueVer
import com.cursokotlin.turismo_vedra.quefacer.QueFacerPrincipal

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var logoVedra = findViewById<ImageButton>(R.id.logoVedra)
        logoVedra.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }
        var equis = findViewById<ImageButton>(R.id.equis)
        equis.setOnClickListener {
            finish()
        }

        var accesoFacer = findViewById<TextView>(R.id.queFacer)
        accesoFacer.setOnClickListener {
            val acceder = Intent(this, QueFacerPrincipal::class.java)
            startActivity(acceder)
        }

        var accesoChegar = findViewById<TextView>(R.id.comoChegar)
        accesoChegar.setOnClickListener {
            val acceder = Intent(this, ComoChegar::class.java)
            startActivity(acceder)
        }
        var accesoVer=findViewById<TextView>(R.id.queVer)
        accesoVer.setOnClickListener {
            val acceder = Intent(this, QueVer::class.java)
            startActivity(acceder)
        }

        var accesoComer=findViewById<TextView>(R.id.ondeComer)
        accesoComer.setOnClickListener {
            val acceder = Intent(this, OndeComerPrincipal ::class.java)
            startActivity(acceder)
        }
        var accesoDurmir=findViewById<TextView>(R.id.ondeDurmir)
        accesoDurmir.setOnClickListener {
            val acceder = Intent(this, OndeDurmir::class.java)
            startActivity(acceder)
        }

        var accesoProductores = findViewById<TextView>(R.id.productoresLocais)
        accesoProductores.setOnClickListener {
            val acceder = Intent(this, ProductoresLocales::class.java)
            startActivity(acceder)
        }
        var accesoContacto=findViewById<TextView>(R.id.contacto)
        accesoContacto.setOnClickListener {
            val acceder = Intent(this, Contacto::class.java)
            startActivity(acceder)
        }

        var mapa = findViewById<TextView>(R.id.mapaTuristico)
        mapa.setOnClickListener {
            var acceso = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.concellodevedra.es/ficheiros/mapa%20tur%C3%ADstico%20vedra.jpg")
            )
            startActivity(acceso)
        }
        var accesoTelefonos=findViewById<TextView>(R.id.telefonos)
        accesoTelefonos.setOnClickListener {
            val acceder = Intent(this, TelefonosInterese::class.java)
            startActivity(acceder)
        }

        var infoTuristica = findViewById<TextView>(R.id.tvInformacionTuristica)
        infoTuristica.setOnClickListener {
                val acceder = Intent(this, InformacionTuristica::class.java)
                startActivity(acceder)
        }
            var webConcello = findViewById<TextView>(R.id.tvWebVedra)
            webConcello.setOnClickListener {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.concellodevedra.es/es")))
            }
        }
    }

