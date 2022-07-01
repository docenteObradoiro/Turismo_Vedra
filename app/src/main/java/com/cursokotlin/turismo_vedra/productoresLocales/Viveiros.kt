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

class Viveiros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viveiros)

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
        var ortigueira=findViewById<ImageButton>(R.id.ortigueira)
        ortigueira.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=ORTIGUEIRA+S.A&rlz=1C1CHBF_esES993ES993&oq=ORTIGUEIRA+S.A&aqs=chrome..69i57j0i22i30.894j0j7&sourceid=chrome&ie=UTF-8")))
        }
        var suffruticosa=findViewById<ImageButton>(R.id.suffruticosa)
        suffruticosa.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=SUFFRUTICOSA-VIVERO+DE+BOJ&rlz=1C1CHBF_esES993ES993&oq=SUFFRUTICOSA-VIVERO+DE+BOJ&aqs=chrome..69i57j33i160.1151j0j9&sourceid=chrome&ie=UTF-8")))
        }
        var verdeVedra=findViewById<ImageButton>(R.id.verdeVedra)
        verdeVedra.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=verde+vedra&rlz=1C1CHBF_esES993ES993&oq=verde+vedra&aqs=chrome..69i57j46i175i199i512j0i22i30j0i10i22i30.3615j0j9&sourceid=chrome&ie=UTF-8")))
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