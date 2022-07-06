package com.cursokotlin.turismo_vedra.quefacer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.MainActivity
import com.cursokotlin.turismo_vedra.Menu
import com.cursokotlin.turismo_vedra.R

class RutasSendeirismo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rutas_sendeirismo)

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

        val sendeirismoPDFgal =findViewById<ImageButton>(R.id.bandeiraGalicia)
        sendeirismoPDFgal.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/ficheiros/folleto%20rutas%20galego_1.pdf")))
        }
        val sendeirismoPDFen =findViewById<ImageButton>(R.id.bandeiraUK)
        sendeirismoPDFen.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/ficheiros/tourist%20map-guide.pdf")))
        }
        val sendeirismoPDFesp =findViewById<ImageButton>(R.id.bandeiraEspana)
        sendeirismoPDFesp.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/ficheiros/folleto%20rutas%20sendeirismo%20Vedra%202020%20castellano.pdf")))
        }
    }
}