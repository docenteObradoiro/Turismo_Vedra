package com.cursokotlin.turismo_vedra.productoresLocales

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.MainActivity
import com.cursokotlin.turismo_vedra.Menu
import com.cursokotlin.turismo_vedra.R

class Adegas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adegas)

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

        var adegaValdes=findViewById<ImageButton>(R.id.adegaValdes)
        adegaValdes.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=adega+valdes&rlz=1C1CHBF_esES993ES993&oq=adega+valdes&aqs=chrome.0.69i59j46i39i175i199j0i10i22i30j0i22i30.2072j0j4&sourceid=chrome&ie=UTF-8")))
        }
        var pazoGalegos=findViewById<ImageButton>(R.id.pazoGalegos)
        pazoGalegos.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.xn--albario-9za.com/bodega/pazo-de-galegos")))
        }
        var agroverdePacego=findViewById<ImageButton>(R.id.agroverde)
        agroverdePacego.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.barallobre.net/")))
        }
        var lixeles=findViewById<ImageButton>(R.id.lixeles)
        lixeles.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lixeles.com/")))
        }
        var solagra=findViewById<ImageButton>(R.id.solagra)
        solagra.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=solagra&rlz=1C1CHBF_esES993ES993&oq=solagra&aqs=chrome..69i57j0i10l2j46i10j0i10l6.1640j0j4&sourceid=chrome&ie=UTF-8")))
        }
        var infoTuristica=findViewById<TextView>(R.id.tvInformacionTuristica)
        infoTuristica.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/es/node/459")))
        }
        var webConcello =findViewById<TextView>(R.id.tvWebVedra)
        webConcello.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/es")))
        }
    }
}