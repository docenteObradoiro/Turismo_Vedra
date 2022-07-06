package com.cursokotlin.turismo_vedra.ondexantar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.InformacionTuristica
import com.cursokotlin.turismo_vedra.R

class DondeComer_Restaurantes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donde_comer_restaurantes)

        val botonvistaalegre = findViewById<ImageButton>(R.id.botonvistalegre)
        botonvistaalegre.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=pazo+de+visya+alegre+vedra&rlz=1C1VDKB_esES993ES993&oq=pazo+de+visya+alegre+vedra&aqs=chrome..69i57j46i13i175i199.3791j0j7&sourceid=chrome&ie=UTF-8")))
        }
        val botonvillaverde = findViewById<ImageButton>(R.id.botonvillaverde)
        botonvillaverde.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=restaurante+villaverde+vedra&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsbNbeINBYDoMwGbd2x6YWaRWTKrew%3A1656917731902&ei=447CYq3MNvGEur4Pv5KWUA&ved=0ahUKEwjtydPG0974AhVxgs4BHT-JBQoQ4dUDCA4&uact=5&oq=restaurante+villaverde+vedra&gs_lcp=Cgdnd3Mtd2l6EAMyCgguEMcBEK8BEA0yBggAEB4QBzoICAAQHhAHEAo6BwguELEDEA06BAgAEA06BQgAEIAEOggIABAeEAgQB0oECEEYAEoECEYYAFAAWIgaYIkbaABwAXgAgAHIAYgB6RSSAQYwLjIwLjGYAQCgAQHAAQE&sclient=gws-wiz")))
        }
        val botonocruceiro = findViewById<ImageButton>(R.id.botonocruceiro)
        botonocruceiro.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=o+cruceiro+vedra&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsaKf3DdDVDyN_adOvIAAmDwp5hdbg%3A1656917747055&ei=847CYuOEA5WllwSwuJ_AAw&ved=0ahUKEwijyvDN0974AhWV0oUKHTDcBzgQ4dUDCA4&uact=5&oq=o+cruceiro+vedra&gs_lcp=Cgdnd3Mtd2l6EAM6BggAEB4QBzoICAAQHhAHEAo6CAgAEB4QCBAHOgoIABAeEA8QCBAHOggIABAeEAcQBUoECEEYAEoECEYYAFAAWIISYLATaAJwAXgAgAG-AYgBgwySAQQwLjEymAEAoAEBwAEB&sclient=gws-wiz")))
        }
        val botonvictoria = findViewById<ImageButton>(R.id.botonvictoria)
        botonvictoria.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=restaurante+victoria+vedra&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsYsnBT7b635GJmjIAkiY1u2t2EIBQ%3A1656917760478&ei=AI_CYsngHI_-lwSk-6ugCg&hotel_occupancy=2&ved=0ahUKEwjJ4KPU0974AhUP_4UKHaT9CqQQ4dUDCA4&uact=5&oq=restaurante+victoria+vedra&gs_lcp=Cgdnd3Mtd2l6EAMyCgguEMcBEK8BEA06BggAEB4QBzoICAAQHhAHEAo6BwguELEDEEM6EAguEIAEEIcCEMcBEK8BEBQ6BAgAEEM6BQgAEIAEOgcILhCxAxANOgQIABANOgoIABAeEAcQBRAKOggIABAeEAgQB0oECEEYAEoECEYYAFAAWJM3YMQ3aAJwAXgAgAHUAYgB4hWSAQYxLjIxLjGYAQCgAQHAAQE&sclient=gws-wiz")))
        }
        val botonjuanito = findViewById<ImageButton>(R.id.botonjuanito)
        botonjuanito.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=o+churrasco+de+juanito+vedra&rlz=1C1VDKB_esES993ES993&hotel_occupancy=2&sxsrf=ALiCzsZgyb5Ro6IuZOKGPjpb7oyXjhJtqg%3A1656917782086&ei=Fo_CYsjmBIa6afP2kOgB&ved=0ahUKEwjIycre0974AhUGXRoKHXM7BB0Q4dUDCA4&uact=5&oq=o+churrasco+de+juanito+vedra&gs_lcp=Cgdnd3Mtd2l6EAMyAggmOgYIABAeEAc6CAgAEB4QBxAKOgUIABCiBEoECEEYAEoECEYYAFAAWMYZYNIbaAFwAXgAgAHCAYgBuhaSAQQxLjIymAEAoAEBwAEB&sclient=gws-wiz")))
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