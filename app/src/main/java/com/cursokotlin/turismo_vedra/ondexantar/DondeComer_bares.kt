package com.cursokotlin.turismo_vedra.ondexantar

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.cursokotlin.turismo_vedra.R
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.dpToPx
import org.imaginativeworld.whynotimagecarousel.spToPx

class DondeComer_bares : AppCompatActivity() {

        private val listVedra= mutableListOf<CarouselItem>()
        private val listaSantaCruz= mutableListOf<CarouselItem>()
        private val listSanFins= mutableListOf<CarouselItem>()


    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_donde_comer_bares)

            val carrusel: ImageCarousel =findViewById(R.id.carousel)
            listVedra.add(CarouselItem(R.mipmap.ferrador))
            listVedra.add(CarouselItem(R.mipmap.derbi))
            listVedra.add(CarouselItem(R.mipmap.esther))
            listVedra.add(CarouselItem(R.mipmap.mosqueiro))
            carrusel.addData(listVedra)

            carrusel.showTopShadow = false
            carrusel.showBottomShadow = false


            val carrusel2: ImageCarousel =findViewById(R.id.carousel2)
            listaSantaCruz.add(CarouselItem(R.mipmap.gundian))
            listaSantaCruz.add(CarouselItem(R.mipmap.patio))
            listaSantaCruz.add(CarouselItem(R.mipmap.terraza))
            listaSantaCruz.add(CarouselItem(R.mipmap.heba))
            carrusel2.addData(listaSantaCruz)

            carrusel2.showTopShadow = false
            carrusel2.showBottomShadow = false

            val carrusel3: ImageCarousel =findViewById(R.id.carousel3)
            listSanFins.add(CarouselItem(R.mipmap.avo))
            listSanFins.add(CarouselItem(R.mipmap.souto))
            listSanFins.add(CarouselItem(R.mipmap.barreiro))
            listSanFins.add(CarouselItem(R.mipmap.rey))
            listSanFins.add(CarouselItem(R.mipmap.vicky))
            carrusel3.addData(listSanFins)

            carrusel3.showTopShadow = false
            carrusel3.showBottomShadow = false

            var webConcello = findViewById<TextView>(R.id.tvWebVedra)
            webConcello.setOnClickListener {
                    startActivity(
                            Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("https://www.concellodevedra.es/es")
                            )
                    )
            }
    }
}