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

class Pirotecnia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pirotecnia)

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

        var gaiteiro=findViewById<ImageButton>(R.id.gaiteiro)
        gaiteiro.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paxinasgalegas.es/gaiteiro-20981em.html")))
        }
        var penide=findViewById<ImageButton>(R.id.penide)
        penide.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=PIROTECNIA+penide&rlz=1C1CHBF_esES993ES993&sxsrf=ALiCzsam2xpMUGiJXDn1CtJ_zyFUHi1kLQ%3A1656663620188&ei=RK6-YouHC42Lur4P2d-OuAg&ved=0ahUKEwiLud_0oNf4AhWNhc4BHdmvA4cQ4dUDCA4&uact=5&oq=PIROTECNIA+penide&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECcyBQgAEIAEMgUIABCABDICCCYyAggmOgcIIxCwAxAnOhMIABCABBCHAhCxAxCDARCwAxAUOggIABCABBCwAzoKCAAQ5AIQsAMYAToTCC4QgAQQxwEQrwEQyAMQsAMYAjoNCC4QgAQQyAMQsAMYAjoGCAAQHhAWOgUIIRCgAUoECEEYAUoECEYYAVDOBVi9FGCRFmgCcAB4AIABqQGIAaYGkgEDMC41mAEAoAEByAETwAEB2gEGCAEQARgJ2gEGCAIQARgI&sclient=gws-wiz")))
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