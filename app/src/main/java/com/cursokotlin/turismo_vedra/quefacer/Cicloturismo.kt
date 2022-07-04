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

class Cicloturismo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cicloturismo)

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
        var PDFcicloturismo=findViewById<TextView>(R.id.tvPDFcicloturismo)
        PDFcicloturismo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/ficheiros/FOLLETO%20rutas_btt%20Vedra.pdf")))
        }
        var PDFaluguer=findViewById<TextView>(R.id.tvDescargaAluguerBici)
        PDFaluguer.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/ficheiros/ALUGUER%20DE%20BICIS.pdf")))
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