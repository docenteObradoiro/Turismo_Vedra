package com.cursokotlin.turismo_vedra

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class InformacionTuristica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_turistica)

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

        var direccionPeons=findViewById<TextView>(R.id.direccionPeons)
        direccionPeons.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/place/42%C2%B047'25.1%22N+8%C2%B026'39.0%22W/@42.790286,-8.4443036,70m/data=!3m1!1e3!4m5!3m4!1s0x0:0x1e2295fd7c7a7f8a!8m2!3d42.7903!4d-8.4441667")))
        }
        var telefonoPeons=findViewById<TextView>(R.id.telefonoPeons)
        telefonoPeons.setOnClickListener {
            val phone = "tel: +34 981512482";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        var emailPeons=findViewById<TextView>(R.id.mailPeons)
        emailPeons.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("casadospeons@concellodevedra.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Solicitud de información")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        var direccionPeregrino=findViewById<TextView>(R.id.direccionPeregrinos)
        direccionPeregrino.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/@42.7785284,-8.4025969,3a,90y,11.9h,71.43t/data=!3m6!1e1!3m4!1siq1wqT7Hk4a6-ey0AaCz2A!2e0!7i13312!8i6656")))
        }
        var telefonoPeregrino=findViewById<TextView>(R.id.telefonoPeregrinos)
        telefonoPeregrino.setOnClickListener {
            val phone = "tel: +34 669450804";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        var webPeregrino=findViewById<TextView>(R.id.webPeregrinos)
        webPeregrino.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/node/44")))
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