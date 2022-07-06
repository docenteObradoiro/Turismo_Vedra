package com.cursokotlin.turismo_vedra.queVer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.cursokotlin.turismo_vedra.MainActivity
import com.cursokotlin.turismo_vedra.R

class Naturaleza: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naturaleza)


        var logoVedra=findViewById<ImageButton>(R.id.logoVedra)
        logoVedra.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }
        var menu=findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder= Intent(this, com.cursokotlin.turismo_vedra.Menu::class.java)
            startActivity(acceder)
        }

        val boton1 = findViewById<ImageButton>(R.id.boton1)
        boton1.setOnClickListener {
            val accederAreaRecreativaDeAgronovo = Intent(this, AreaRecreativaDeAgronovo::class.java)
            startActivity(accederAreaRecreativaDeAgronovo)
        }
        val boton2 = findViewById<ImageButton>(R.id.boton2)
        boton2.setOnClickListener {
            val accederCubelas = Intent(this, AreaDeRecreoDeCubelas::class.java)
            startActivity(accederCubelas)
        }
        val boton3 = findViewById<ImageButton>(R.id.boton3)
        boton3.setOnClickListener {
            val accederMiradorGundian = Intent(this, MiradorGundian::class.java)
            startActivity(accederMiradorGundian)
        }
        val boton4 = findViewById<ImageButton>(R.id.boton4)
        boton4.setOnClickListener {
            val accederCampoGundian = Intent(this, CampoGundian::class.java)
            startActivity(accederCampoGundian)
        }
        val boton5 = findViewById<ImageButton>(R.id.boton5)
        boton5.setOnClickListener {
            val accederCoutoXimonde = Intent(this, CoutoXimonde::class.java)
            startActivity(accederCoutoXimonde)
        }

val informacionTuristica = findViewById<TextView>(R.id.tvInformacionTuristica)
informacionTuristica.setOnClickListener {
    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/node/44")))
}

val paginaConcello = findViewById<TextView>(R.id.tvWebVedra)
paginaConcello.setOnClickListener {
    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/")))
}
}

}