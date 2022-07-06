package com.cursokotlin.turismo_vedra.ondexantar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.InformacionTuristica
import com.cursokotlin.turismo_vedra.R
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class DondeComer_bares : AppCompatActivity() {

    val listaVedra = mutableListOf<CarouselItem>()
    val listaSantaCruz = mutableListOf<CarouselItem>()
    val listaSanFins = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donde_comer_bares)

        val carruselVedra:ImageCarousel= findViewById(R.id.carousel)
        listaVedra.add(CarouselItem(R.mipmap.ferrador))
        listaVedra.add(CarouselItem(R.mipmap.derbi))
        listaVedra.add(CarouselItem(R.mipmap.esther))
        listaVedra.add(CarouselItem(R.mipmap.mosqueiro))
        carruselVedra.addData(listaVedra)

        carruselVedra.showTopShadow = false
        carruselVedra.showBottomShadow = false

        val carruselSantaCruz:ImageCarousel= findViewById(R.id.carousel2)
        listaSantaCruz.add(CarouselItem(R.mipmap.tabernagundian))
        listaSantaCruz.add(CarouselItem(R.mipmap.patio))
        listaSantaCruz.add(CarouselItem(R.mipmap.terraza))
        listaSantaCruz.add(CarouselItem(R.mipmap.heba))
        carruselSantaCruz.addData(listaSantaCruz)

        carruselSantaCruz.showTopShadow = false
        carruselSantaCruz.showBottomShadow = false

        val carruselSanFins:ImageCarousel= findViewById(R.id.carousel3)
        listaSanFins.add(CarouselItem(R.mipmap.souto))
        listaSanFins.add(CarouselItem(R.mipmap.avo))
        listaSanFins.add(CarouselItem(R.mipmap.barreiro))
        listaSanFins.add(CarouselItem(R.mipmap.vicky))
        listaSanFins.add(CarouselItem(R.mipmap.rey))
        carruselSanFins.addData(listaSanFins)

        carruselSanFins.showTopShadow = false
        carruselSanFins.showBottomShadow = false


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