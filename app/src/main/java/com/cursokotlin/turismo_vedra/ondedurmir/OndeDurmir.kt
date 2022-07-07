package com.cursokotlin.turismo_vedra.ondedurmir

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
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class OndeDurmir : AppCompatActivity() {
    val listaAloxamentos = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onde_durmir)

        var menu = findViewById<ImageButton>(R.id.menu4)
        menu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }
        var logoVedra=findViewById<ImageButton>(R.id.botonVedraMapa4)
        logoVedra.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        val carruselVedra: ImageCarousel = findViewById(R.id.carouselAloxamentos)
        listaAloxamentos.add(CarouselItem(R.mipmap.tabernagundian))
        listaAloxamentos.add(CarouselItem(R.mipmap.cruceiro))
        listaAloxamentos.add(CarouselItem(R.mipmap.avo))
        listaAloxamentos.add(CarouselItem(R.mipmap.anton))
        listaAloxamentos.add(CarouselItem(R.mipmap.lameira))
        listaAloxamentos.add(CarouselItem(R.mipmap.ivan))
        listaAloxamentos.add(CarouselItem(R.mipmap.meyre))
        listaAloxamentos.add(CarouselItem(R.mipmap.renda))
        listaAloxamentos.add(CarouselItem(R.mipmap.alfredo))

        carruselVedra.addData(listaAloxamentos)

        carruselVedra.showTopShadow = false
        carruselVedra.showBottomShadow = false

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