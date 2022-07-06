package com.cursokotlin.turismo_vedra

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Contacto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)

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

        var concelloVedra=findViewById<ImageButton>(R.id.enlaceWebConcello)
        concelloVedra.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/")))
        }

        var direccionConcello=findViewById<TextView>(R.id.direccionConcello)
        direccionConcello.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/Avda.+Mestre+Manuel+G%C3%B3mez+Lorenzo,+N%C2%BA1+15885+-+Vedra+A+Coru%C3%B1a/@42.7750469,-8.484543,17z/data=!3m1!4b1")))
        }

        var telefono=findViewById<TextView>(R.id.telefonoConcello)
        telefono.setOnClickListener {
            val phone = "tel: +34 981814612";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
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