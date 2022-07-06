package com.cursokotlin.turismo_vedra



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.net.Uri
import android.widget.TextView
import com.cursokotlin.turismo_vedra.ondedurmir.OndeDurmir
import com.cursokotlin.turismo_vedra.ondexantar.OndeComerPrincipal
import com.cursokotlin.turismo_vedra.productoresLocales.ProductoresLocales
import com.cursokotlin.turismo_vedra.queVer.QueVer
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

        var accesoqueVer= findViewById<Button>(R.id.queVerBoton)
        accesoqueVer.setOnClickListener{
            val acceder = Intent(this, QueVer::class.java)
            startActivity(acceder)
        }

        var accesoFacer=findViewById<TextView>(R.id.queFacerBoton)
        accesoFacer.setOnClickListener {
            val acceder = Intent(this, QueFacerPrincipal::class.java)
            startActivity(acceder)
        }
        
        var accesoProductores= findViewById<Button>(R.id.productoresLocaisBoton)
        accesoProductores.setOnClickListener{
            val acceder = Intent(this, ProductoresLocales::class.java)
            startActivity(acceder)
        }

        var accesoDormir= findViewById<Button>(R.id.ondeDurmirBoton)
        accesoDormir.setOnClickListener{
            val acceder = Intent(this, OndeDurmir::class.java)
            startActivity(acceder)
        }

        var accesoComer=findViewById<Button>(R.id.ondeComerBoton)
        accesoComer.setOnClickListener {
            val acceder = Intent(this, OndeComerPrincipal ::class.java)
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
