package com.cursokotlin.turismo_vedra.ondedormir

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.cursokotlin.turismo_vedra.R
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class OndeDurmir : AppCompatActivity() {

    private val listaAloxamentos= mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onde_durmir)

        val carrusel4: ImageCarousel =findViewById(R.id.carousel)
        listaAloxamentos.add(CarouselItem(R.mipmap.eiragundian))
        listaAloxamentos.add(CarouselItem(R.mipmap.avo))
        listaAloxamentos.add(CarouselItem(R.mipmap.anton))
        listaAloxamentos.add(CarouselItem(R.mipmap.alfredo))
        listaAloxamentos.add(CarouselItem(R.mipmap.lameira))
        listaAloxamentos.add(CarouselItem(R.mipmap.ivan))
        listaAloxamentos.add(CarouselItem(R.mipmap.meyre))
        listaAloxamentos.add(CarouselItem(R.mipmap.renda))
        carrusel4.addData(listaAloxamentos)

        carrusel4.showTopShadow = false
        carrusel4.showBottomShadow = false


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
