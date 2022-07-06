package com.cursokotlin.turismo_vedra

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)

        val animacion1: Animation = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo)
        val animacion2: Animation = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba)

        val textoInicio = findViewById<TextView>(R.id.textView)
        val imagenIncio = findViewById<ImageView>(R.id.imageView)

        textoInicio.startAnimation(animacion1)
        imagenIncio.startAnimation(animacion2)

        Handler(Looper.getMainLooper()).postDelayed({
            /* Create an Intent that will start the Menu-Activity. */
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3500)


    }
}