package com.cursokotlin.turismo_vedra


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.cursokotlin.turismo_vedra.ondexantar.DondeComer_Restaurantes
import com.cursokotlin.turismo_vedra.ondexantar.DondeComer_bares
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.cursokotlin.turismo_vedra.productoresLocales.ProductoresLocales
import com.cursokotlin.turismo_vedra.quefacer.QueFacerPrincipal


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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
        
        var accesoProductores= findViewById<Button>(R.id.productoresLocaisBoton)
        accesoProductores.setOnClickListener{
            val acceder = Intent(this, ProductoresLocales::class.java)
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
