package com.cursokotlin.turismo_vedra.productoresLocales

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.InformacionTuristica
import com.cursokotlin.turismo_vedra.MainActivity
import com.cursokotlin.turismo_vedra.Menu
import com.cursokotlin.turismo_vedra.R

class Froitas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_froitas)

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
        var agrovedra=findViewById<ImageButton>(R.id.agrovedra)
        agrovedra.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=agrovedra&rlz=1C1CHBF_esES993ES993&oq=agrovedra&aqs=chrome..69i57j46i175i199i512.2031j0j9&sourceid=chrome&ie=UTF-8")))
        }
        var froitasCompostela=findViewById<ImageButton>(R.id.frutasCompostela)
        froitasCompostela.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=frutas+compostela&rlz=1C1CHBF_esES993ES993&oq=frutas+compostela&aqs=chrome..69i57j0i22i30j0i15i22i30j0i22i30.2903j0j4&sourceid=chrome&ie=UTF-8")))
        }
        var paradayalvela=findViewById<ImageButton>(R.id.viudaParada)
        paradayalvela.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.viparal.es/")))
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