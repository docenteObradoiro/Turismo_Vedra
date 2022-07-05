package com.cursokotlin.turismo_vedra.productoresLocales

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.InformacionTuristica
import com.cursokotlin.turismo_vedra.MainActivity
import com.cursokotlin.turismo_vedra.Menu
import com.cursokotlin.turismo_vedra.R

class ProductoresLocales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productores_locales)

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

        var accesoAdegas=findViewById<ImageButton>(R.id.adegas)
        accesoAdegas.setOnClickListener {
            val acceder = Intent(this, Adegas::class.java)
            startActivity(acceder)
        }
        var accesoDestileria=findViewById<ImageButton>(R.id.destileria)
        accesoDestileria.setOnClickListener {
            val acceder = Intent(this, Destilerias::class.java)
            startActivity(acceder)
        }
        var accesoFroitas=findViewById<ImageButton>(R.id.froitas)
        accesoFroitas.setOnClickListener {
            val acceder = Intent(this, Froitas::class.java)
            startActivity(acceder)
        }
        var accesoViveiros=findViewById<ImageButton>(R.id.viveiros)
        accesoViveiros.setOnClickListener {
            val acceder = Intent(this, Viveiros::class.java)
            startActivity(acceder)
        }
        var accesoPanaderias=findViewById<ImageButton>(R.id.panaderia)
        accesoPanaderias.setOnClickListener {
            val acceder = Intent(this, Panaderias::class.java)
            startActivity(acceder)
        }
        var accesoAceite=findViewById<ImageButton>(R.id.aceite)
        accesoAceite.setOnClickListener {
            val acceder = Intent(this, Aceite::class.java)
            startActivity(acceder)
        }
        var accesoArtesania=findViewById<ImageButton>(R.id.artesania)
        accesoArtesania.setOnClickListener {
            val acceder = Intent(this, Artesania::class.java)
            startActivity(acceder)
        }
        var accesoDeseño=findViewById<ImageButton>(R.id.deseño)
        accesoDeseño.setOnClickListener {
            val acceder = Intent(this, Deseno::class.java)
            startActivity(acceder)
        }
        var accesoTocados=findViewById<ImageButton>(R.id.tocados)
        accesoTocados.setOnClickListener {
            val acceder = Intent(this, Tocados::class.java)
            startActivity(acceder)
        }
        var accesoPirotecnia=findViewById<ImageButton>(R.id.pirotecnia)
        accesoPirotecnia.setOnClickListener {
            val acceder = Intent(this, Pirotecnia::class.java)
            startActivity(acceder)
        }
        var infoTuristica=findViewById<TextView>(R.id.tvInformacionTuristica)
        infoTuristica.setOnClickListener {
                val acceder = Intent(this, InformacionTuristica::class.java)
                startActivity(acceder)
        }
        var webConcello =findViewById<TextView>(R.id.tvWebVedra)
        webConcello.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/es")))
        }
    }
   }