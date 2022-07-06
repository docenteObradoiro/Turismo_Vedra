package com.cursokotlin.turismo_vedra.ondedurmir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cursokotlin.turismo_vedra.R
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class OndeDurmir : AppCompatActivity() {
    val listaAloxamentos = mutableListOf<CarouselItem>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onde_durmir)

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

    }
}