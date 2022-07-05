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

class Destilerias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destileria)

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

        var aguardentes=findViewById<ImageButton>(R.id.aguardientesGalicia)
        aguardentes.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=AGUARDIENTES+DE+GALICIA+S.A.&rlz=1C1CHBF_esES993ES993&oq=AGUARDIENTES+DE+GALICIA+S.A.&aqs=chrome..69i57j0i22i30.959j0j9&sourceid=chrome&ie=UTF-8")))
        }
        var galicianOriginal=findViewById<ImageButton>(R.id.galicianOriginalDrink)
        galicianOriginal.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=galician+original+drinks&rlz=1C1CHBF_esES993ES993&oq=galician+o&aqs=chrome.0.0i355i512j46i175i199i512j0i512j69i57j0i512l2j0i10i512j0i22i30l3.2855j0j9&sourceid=chrome&ie=UTF-8")))
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